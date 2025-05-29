# Use an official Java runtime as base image
FROM openjdk:17-jdk-slim

# Set work directory in container
WORKDIR /app

# Copy jar file from host to container
COPY target/*.jar app.jar

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
