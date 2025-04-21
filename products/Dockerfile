FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/products-*.jar products.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "products.jar"]