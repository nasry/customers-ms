FROM openjdk:8-jdk-alpine
WORKDIR /usr/src/app
COPY target/*.jar customers-ms.jar
ENTRYPOINT ["java", "-jar", "customers-ms.jar"]