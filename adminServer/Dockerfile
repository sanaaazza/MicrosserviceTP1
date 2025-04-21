FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/adminServer-*.jar adminServer.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "adminServer.jar"]