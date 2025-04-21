FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/confServer-*.jar confServer.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "confServer.jar"]