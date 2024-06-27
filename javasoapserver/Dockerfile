FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/javasoapserver.jar client.jar

# Expose the port that the server will run on
EXPOSE 8082

# Command to run the application
CMD ["java", "-jar", "server.jar"]
