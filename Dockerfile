FROM openjdk:17
EXPOSE 8080
ADD target/springboot-docker.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","/springboot-docker.jar"]

#FROM openjdk:8-jre
#
#ENTRYPOINT ["java", "-jar", "/app.jar"]
#
#ARG JAR_FILE
#ADD target/${JAR_FILE} /app.jar