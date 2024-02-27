FROM eclipse-temurin:17
WORKDIR /home
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE = home/runner/work/FirstHelloWorld/FirstHelloWorld/target/demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
