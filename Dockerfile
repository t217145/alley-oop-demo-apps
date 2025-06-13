FROM openjdk:17-jdk-alpine

WORKDIR /usr/src/app

COPY ./build/libs/app.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
