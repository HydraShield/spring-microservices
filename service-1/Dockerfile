FROM openjdk:17-oracle

WORKDIR /microservices-application

COPY ./target/service-1-0.0.1 /microservices-application/service-1.jar

EXPOSE 8080

CMD ["java", "-jar", "service-1.jar"]