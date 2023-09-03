FROM openjdk:17-oracle

WORKDIR /microservices-application

COPY ./target/service-2-0.0.1 /microservices-application/service-2.jar

EXPOSE 8081

CMD ["java", "-jar", "service-2.jar"]