FROM openjdk:jdk-alpine

WORKDIR code/

RUN apk add maven --no-cache

ADD src/ src/
COPY pom.xml .
RUN mvn install && rm -rf src/

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]
