FROM java:8
EXPOSE 8090
ADD target/processPensionMicroservice.war processPensionMicroservice.war
ENTRYPOINT ["java","-war","processPensionMicroservice.war"]