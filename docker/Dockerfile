FROM openjdk:8-jre
MAINTAINER yuxl <164553349@qq.com>

# ENV APP_VERSION 1.0.0-SNAPSHOT

RUN mkdir /app
COPY iToken-config-1.0.0-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar","--spring.profiles.active=dev"]

EXPOSE 8000