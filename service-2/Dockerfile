FROM openjdk:17-oracle

WORKDIR /microservices-application

COPY service-2/target/service-2-0.0.1.jar /microservices-application/service-2.jar

EXPOSE 8081

CMD ["java", "-jar", "service-2.jar"]