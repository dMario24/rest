# Getting Started

## REST
```bash

# INSERT
$ curl -X POST -H "Content-Type:application/json" \
-d '{"firstName": "Frodo", "lastName": "Baggins"}' \
http://localhost:8080/people

# SELECT
$ curl -X GET http://localhost:8080/people/1

# DELETE
$ curl -X DELETE http://localhost:8080/people/1

# UPDATE
$ curl -X PUT -H "Content-Type:application/json" \
-d '{"firstName": "P Frodo", "lastName": "P Baggins"}' \
http://localhost:8080/people/2

$ curl -X PATCH -H "Content-Type:application/json" \
-d '{"firstName": "PATCH Frodo"}' \
http://localhost:8080/people/2
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.4/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.4/gradle-plugin/packaging-oci-image.html)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.3.4/reference/htmlsingle/index.html#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

