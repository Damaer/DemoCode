FROM openjdk:8-jdk-alpine
EXPOSE 8081
VOLUME /tmp
ADD springbootdocker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]