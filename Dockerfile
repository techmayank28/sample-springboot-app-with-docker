FROM openjdk:17-jdk-slim
EXPOSE 9090
ADD target/samplespringbootapp-docker.jar samplespringbootapp-docker.jar
ENTRYPOINT [ "java", "-jar", "/samplespringbootapp-docker.jar" ]