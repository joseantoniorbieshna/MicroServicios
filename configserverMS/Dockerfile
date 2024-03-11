FROM amazoncorretto:17
WORKDIR /app
COPY . .
RUN ./mvnw clean package
EXPOSE 8888
CMD [ "java","-jar","/app/target/ConfigServerMS-0.0.1-SNAPSHOT.jar" ]