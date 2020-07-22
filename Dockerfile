FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} app.jar

RUN echo "Creating docker image"

ENTRYPOINT ["java", "-jar", "app.jar"]

MAINTAINER "nk.nikhil150@gmail.com"