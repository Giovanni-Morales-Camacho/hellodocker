# Etapa 1: Construcción
FROM eclipse-temurin:23 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN apt-get update && apt-get install -y maven
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
FROM eclipse-temurin:23-jre
WORKDIR /app
COPY --from=build /app/target/holadocker-0.0.1-SNAPSHOT.jar holadocker.jar
CMD ["java", "-jar", "holadocker.jar"]