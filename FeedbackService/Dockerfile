FROM openjdk:11
EXPOSE 8086
ADD ./target/FeedbackService-1.0-SNAPSHOT-jar-with-dependencies.jar FeedbackService-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar", "FeedbackService-1.0-SNAPSHOT-jar-with-dependencies.jar"]