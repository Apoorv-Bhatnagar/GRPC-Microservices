FROM openjdk:11
EXPOSE 8082
ADD ./target/UserService-1.0-SNAPSHOT-jar-with-dependencies.jar UserService-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar", "UserService-1.0-SNAPSHOT-jar-with-dependencies.jar"]