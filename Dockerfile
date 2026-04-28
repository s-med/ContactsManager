# Utilise directement l'image Java 21
FROM eclipse-temurin:21-jre-jammy

# Définit le dossier de travail
WORKDIR /app

# Copie le JAR que TU as déjà généré localement avec ./gradlew jar
# Note : le chemin doit correspondre à ton dossier build/libs
COPY build/libs/*.jar app.jar

# Lance l'application
ENTRYPOINT ["java", "-jar", "app.jar"]