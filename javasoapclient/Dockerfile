FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/javasoapclient.jar client.jar

# Expose the port that the client will run on
EXPOSE 3000

# Command to run the application
CMD ["java", "-jar", "client.jar"]
