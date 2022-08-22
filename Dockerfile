FROM openjdk:17-jdk-slim-buster AS builder
EXPOSE 8090
ADD target/processPensionMicroservice.war processPensionMicroservice.war
ENTRYPOINT ["java","-war","processPensionMicroservice.war"]
