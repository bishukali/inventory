FROM openjdk:17
WORKDIR /app
COPY target/*.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","*.jar"]
