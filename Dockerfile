FROM maven:latest AS builder
WORKDIR /app
COPY . .
RUN mkdir -p logs
RUN mvn clean install

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/docker_devops.jar .
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "docker_devops.jar"]