package com.goconsult.interceptor;


import com.goconsult.service.DbHelper;
import io.grpc.*;
import io.jsonwebtoken.*;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;

public class serverInterceptor implements ServerInterceptor {

    public static int UID;
    private JwtParser jwtParser = Jwts.parser().setSigningKey("L8hHXsaQOUjk5rg7XPGv4eL36anlCrkMz8CJ0i/8E/0=");


    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        // extract token from metadata

        String token = metadata.get(Metadata.Key.of("Token",ASCII_STRING_MARSHALLER));
        Status status = Status.OK;

        if(token==null)
            status = Status.UNAUTHENTICATED.withDescription("Token is missing");
        else if(!token.startsWith("Bearer"))
            status = Status.UNAUTHENTICATED.withDescription("unknown authorization token type");
        else {
            Jws<Claims> claimsJws = null;
            try {
                claimsJws = jwtParser.parseClaimsJws(token.substring(6).trim());
            } catch (JwtException e) {
                status = Status.UNAUTHENTICATED.withDescription(e.getMessage()).withCause(e);
            }
            if(claimsJws!=null)
            {
                Context context = Context.current().withValue(Context.key("TokenData"),
                        claimsJws.getBody().getSubject());

                System.out.println(claimsJws.getBody().getSubject());  //line 39 to 40 to check is the logged person is user or counselor, line 42 to save the logged in uid to class itself for taking reference in service classes.

                String email= (String) claimsJws.getBody().get("email");
                int UID=DbHelper.getIdForInterceptorByEmail(email);

                if( UID==0){
                    status = Status.UNAUTHENTICATED.withDescription("Invalid Token for Counselor");
                }else{

                    //DbHelper.getIdForInterceptorByEmail(email);
                    serverInterceptor.UID=UID;
                    DbHelper.UID=serverInterceptor.UID;

                return Contexts.interceptCall(context,serverCall,metadata,serverCallHandler);
                }
            }
        }
        serverCall.close(status, new Metadata());
        return new ServerCall.Listener<ReqT>() {
        };
    }
}
