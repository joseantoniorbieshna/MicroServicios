FROM amazoncorretto:17
WORKDIR /app
COPY . .
RUN ./mvnw clean package
EXPOSE 8761
CMD [ "java","-jar","/app/target/EurekaMS-0.0.1-SNAPSHOT.jar" ]