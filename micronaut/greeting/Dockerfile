FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim

LABEL version="0.0.1"

COPY build/libs/greeting-*-all.jar greeting.jar

ENV LOG_PATH=/var/log/micronaut/
RUN mkdir ${LOG_PATH}

EXPOSE 8080
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar greeting.jar

