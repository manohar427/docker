FROM openjdk:8

ADD target/docker-spring-0.0.1-SNAPSHOT.jar test.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","test.jar"]