FROM amazoncorretto:17
ARG JAR_FILE=target/product-management-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} application.jar
CMD apt-get update -y
ENTRYPOINT ["java", "-Xmx2048M", "-jar", "/application.jar"]