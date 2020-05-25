FROM  openjdk:8-jdk-alpine
ADD target/*.jar springBootBasico.jar
ENTRYPOINT ["sh", "-c", "java -jar /springBootBasico.jar"]