FROM openjdk:21-jdk

LABEL maintainer="Angel Cuenca <angelnpo@gmail.com>"

# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

WORKDIR /api

#COPY tthh-api-rest-migration-services/build/libs/*.jar /api/app.jar
COPY /build/libs/gateway-services-1.0.0-SNAPSHOT.jar /api/app.jar

RUN echo "WORKDIR: " &&  ls -al /api

ENV PORT 8090

EXPOSE $PORT

ENTRYPOINT ["java", "-jar", "/api/app.jar", "update"]
#CMD ["java", "-jar", "/api/app.jar", "update"]