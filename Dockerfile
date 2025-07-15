FROM openjdk:21-jdk-slim-bullseye AS builder

WORKDIR /app



COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .


RUN chmod +x mvnw

RUN ./mvnw dependency:go-offline -B

COPY src ./src

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jre

WORKDIR /app

#RUN groupadd --system spring && useradd --system --gid spring spring


#USER spring

COPY --from=builder /app/target/*.jar app.jar

RUN java -Djarmode=layertools -jar app.jar extract

EXPOSE 8080
#
#ENTRYPOINT ["java","org.springframework.boot.loader.JarLauncher"]

ENTRYPOINT ["java", "-jar","app.jar"]