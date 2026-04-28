# Étape 1 : Compilation
FROM gradle:8.5-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle jar --no-daemon

# Étape 2 : Exécution
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/ContactsManager.jar .
CMD ["java", "-jar", "ContactsManager.jar"]