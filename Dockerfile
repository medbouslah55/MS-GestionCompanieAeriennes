FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD /target/GestionDeCompanie.jar GestionDeCompanie.jar
ENTRYPOINT ["java","-jar","GestionDeCompanie.jar"]