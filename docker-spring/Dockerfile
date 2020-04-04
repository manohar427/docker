FROM openjdk:8

ADD target/docker-spring-0.0.1-SNAPSHOT.jar test.jar
EXPOSE 1111
ENTRYPOINT ["java","-jar","test.jar"]