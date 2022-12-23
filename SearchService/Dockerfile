FROM openjdk:11
EXPOSE 8084
ADD ./target/SearchService-1.0-SNAPSHOT-jar-with-dependencies.jar SearchService-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar", "SearchService-1.0-SNAPSHOT-jar-with-dependencies.jar"]