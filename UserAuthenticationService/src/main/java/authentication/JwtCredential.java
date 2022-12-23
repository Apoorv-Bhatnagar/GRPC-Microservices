//package authentication;
//
//import io.grpc.CallCredentials;
//import io.grpc.Metadata;
//import io.grpc.Status;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.concurrent.Executor;
//
//public class JwtCredential extends CallCredentials {
//    private final String subject;
//
//    JwtCredential(String subject) {
//        this.subject = subject;
//    }
//
//    @Override
//    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
//        final String jwt =
//                Jwts.builder()
//                        .setSubject(subject)
//                        .signWith(SignatureAlgorithm.HS256, Constant.JWT_SIGNING_KEY)
//                        .compact();
//        executor.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Metadata headers = new Metadata();
//                    headers.put(Constant.AUTHORIZATION_METADATA_KEY,
//                            String.format("%s %s", Constant.BEARER_TYPE, jwt));
//                    metadataApplier.apply(headers);
//                } catch (Throwable e) {
//                    metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
//                }
//            }
//        });
//    }
//
//    @Override
//    public void thisUsesUnstableApi() {
//
//    }
//}
