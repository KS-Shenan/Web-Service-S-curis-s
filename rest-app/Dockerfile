# Utilise une image Java 11 officielle
FROM openjdk:11-jdk-slim

# Définit le répertoire de travail
WORKDIR /rest-app

# Copie le fichier jar généré par Spring Boot dans le conteneur
COPY target/javarestserver-1.0-SNAPSHOT.jar javarestserver-1.0-SNAPSHOT.jar

# Expose le port 8080
EXPOSE 8080

# Commande pour exécuter l'application Spring Boot
ENTRYPOINT ["java", "-jar", "javarestserver-1.0-SNAPSHOT.jar"]