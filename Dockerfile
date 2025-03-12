FROM openjdk:17

# Set up a directory before copying the JAR file
WORKDIR /app

# Create the logs directory explicitly
RUN mkdir -p logs

# Copy the JAR file to the /app directory (not logs, to avoid conflicts)
COPY target/docker_devops.jar /app/

# Set the working directory to /app
WORKDIR /app

# Expose the port the app runs on
EXPOSE 8000

# Run the Java application
ENTRYPOINT ["java", "-jar", "docker_devops.jar"]