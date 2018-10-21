FROM openjdk:8
ADD target/BootDockerDemo.jar BootDockerDemo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","BootDockerDemo.jar"]
