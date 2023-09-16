FROM eclipse-temurin:17
ADD target/dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]
