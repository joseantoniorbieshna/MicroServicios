FROM amazoncorretto:17
WORKDIR /app
COPY . .
RUN ./mvnw clean package
EXPOSE 8090
CMD [ "java","-jar","/app/target/EstudainteMS-0.0.1-SNAPSHOT.jar"]