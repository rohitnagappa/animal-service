FROM openjdk:11-slim as build

MAINTAINER "ROHIT NAGAPPA"

COPY build/libs/animal-service-1.0-SNAPSHOT.jar animal-service.jar

ENTRYPOINT ["java", "-jar", "/animal-service.jar"]