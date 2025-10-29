FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/SimpleSpringMock-1.0-SNAPSHOT.jar app.jar
EXPOSE 12222
ENTRYPOINT ["java", "-jar", "app.jar"]