FROM openjdk:11
EXPOSE 8080
ADD ./target/UserAuthenticationService-1.0-SNAPSHOT-jar-with-dependencies.jar UserAuthenticationService-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar", "UserAuthenticationService-1.0-SNAPSHOT-jar-with-dependencies.jar"]