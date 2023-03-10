FROM openjdk:21-slim-buster
WORKDIR /app
COPY ./target/oops-demo-0.0.1-SNAPSHOT.jar /app
RUN chmod +x oops-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "oops-demo-0.0.1-SNAPSHOT.jar"]