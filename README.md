# Getting Started

### Libraries & Tech
* Gradle 5.6
* Spring Boot 2.1.8
* Spring Data JPA
* Spring Data Redis
* Lombok
* Flyway DB
* PostgreSQL
* Spring Cloud Zuul
* Spring Cloud Zuul RateLimit
* Hazelcast
* Undertow

### Pre-requisite
Copy these jars to hazelcast server user library:
```shell script
command-prompt$ hazelcast-{version}/user-lib
```
* bucket4j-core-4.5.0.jar
* bucket4j-hazelcast-4.5.0.jar
* bucket4j-jcache-4.5.0.jar
* cache-api-1.0.0.jar

### Gradle command
#### Clean
```shell script
./gradlew clean
```
#### Build
```shell script
./gradlew build
```

### Run Go service
```shell script
./binary/hello-go-mac-os
```

### Reference
* https://github.com/marcosbarbero/spring-cloud-zuul-ratelimit
* https://bintray.com/vladimir-bukhtoyarov/maven/bucket4j-parent/view/files/com/github/vladimir-bukhtoyarov/#files/com/github/vladimir-bukhtoyarov/