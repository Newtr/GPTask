FROM maven:3.9.7-eclipse-temurin-17-alpine AS build

WORKDIR /MyApp

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /MyApp

COPY --from=build /MyApp/target/*.jar ./app.jar

EXPOSE 8092

CMD ["java", "-jar", "app.jar"]