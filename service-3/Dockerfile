FROM openjdk:17-oracle

WORKDIR /microservices-application

COPY service-3/target/service-3-0.0.1.jar /microservices-application/service-3.jar

EXPOSE 8082

CMD ["java", "-jar", "service-3.jar"]