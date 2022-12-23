FROM openjdk:11
EXPOSE 8083
ADD ./target/NotificationService-1.0-SNAPSHOT-jar-with-dependencies.jar NotificationService-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar", "NotificationService-1.0-SNAPSHOT-jar-with-dependencies.jar"]