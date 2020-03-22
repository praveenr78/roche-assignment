
# Roche Assignment

This is a Java based Spring Boot Application.


## Setup to run locally

### Pre-requisites

1. JRE 8.0.1
2. Docker ( Docker for Desktop to run locally)
3. Gradle
4. MongoDB (Standalone to run locally)


### Configuration

1. MongoDb Database needs to be up and running before the application starts. You will need to have the  MongoDb  accessible on port 27017 with a database of name 'roche_assign' created locally

```sh
 uri: mongodb://127.0.0.1:27017/roche_assign
```

2. Clone Repository

```sh
git clone https://github.com/praveenr78/roche-assignment.git

```
3. You will need to build the artifacts for the source code, using `gradle`.

```sh
./gradlew clean build
```
4. The apps should then startup cleanly if you run

```sh
docker-compose build
docker-compose up
```

5. Roche assignment application will be start on http://localhost:8080 

6. Swagger docs at http://localhost:8080/swagger-ui/index.html?url=/v3/api-docs&validatorUrl=#/

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/gradle-plugin/reference/html/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#production-ready)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-mongodb)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

