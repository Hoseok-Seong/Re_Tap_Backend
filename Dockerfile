FROM openjdk:17-jdk-slim
ARG JAR_FILE=<your-jar-file-path>
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
