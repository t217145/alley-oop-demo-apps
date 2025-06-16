FROM openjdk:17-jdk-alpine

WORKDIR /usr/src/app

COPY app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]