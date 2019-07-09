FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar kpss.jar
RUN mkdir config
COPY config/application.properties config/application.properties
ENTRYPOINT ["java", "-jar", "/kpss.jar"]