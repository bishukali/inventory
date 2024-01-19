FROM openjdk:17
COPY target/*.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","*.jar"]
