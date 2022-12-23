package authentication;

import com.stackroute.grpc.AuthServiceOuterClass;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JWTGenerator {

    public String generateJWT(AuthServiceOuterClass.request request) {
        Date date1 = new Date();
        long t1 = date1.getTime();
        Date issuedAt = new Date(t1);
        Date expirationTime1 = new Date(t1 + 500000l);
        String jws = Jwts.builder()
                .setSubject("login")
                .claim("email", request.getName())
                .setIssuedAt(issuedAt)
                .setExpiration(expirationTime1)
                .signWith(
                        SignatureAlgorithm.HS256,
                        "L8hHXsaQOUjk5rg7XPGv4eL36anlCrkMz8CJ0i/8E/0="
                )
                .compact();
        System.out.println("In JWTGenerator class...." + jws);
        return jws;
    }
}
