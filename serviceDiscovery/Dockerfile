FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/serverDiscovery-*.jar serverDiscovery.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "serverDiscovery.jar"]