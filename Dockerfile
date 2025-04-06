FROM openjdk:17-jdk-slim

#set the working directory
WORKDIR /app

#copy the application jar
COPY target/simple-one-crud-0.0.1-SNAPSHOT.jar /app/simple-one-crud-0.0.1-SNAPSHOT.jar

#environment variable
ENV DB_HOST=jdbc:mysql://localhost:3306/pantos
ENV DB_USERNAME=root
ENV DB_PASSWORD=pass

#port
EXPOSE 8081

#run application
CMD ['java', '-jar', 'simple-one-crud-0.0.1-SNAPSHOT.jar']