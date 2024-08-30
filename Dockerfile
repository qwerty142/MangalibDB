FROM openjdk:17-jdk-alpine
COPY out/artifacts/dbRepository_jar3/dbRepository.jar appppp.jar
CMD ["java","-jar","/appppp.jar"]