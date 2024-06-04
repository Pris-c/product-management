FROM openjdk:17-jdk

COPY target/product-management-0.0.1-SNAPSHOT.jar /app/product-management.jar

CMD ["java", "-jar", "product-management.jar"]