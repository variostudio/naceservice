# NACE service

## Features of project:
* Possible build abd run with IntelliJ Idea
* H2 in-memory database is used + H2 console to verify data. Used `data.sql` and `schema.sql` to initialize H2.
* SWAGGER UI is used for user friendly calls
* Caffeine cache is used to performance improvement
* Java, SpringBoot, SpringBoot JPA, Spring Web and so on 
* Mock (`NaceServiceTest`) and integration test (`IntegrationTest`) in place
* One executable JAR is building (`target/NaceService-1.jar`)

### Build and Run:
Use `mvn clean install`
And run the main class: `NaceRunner`

### SWAGGER UI:
http://localhost:8080/swagger-ui/index.html

### H2 Console:
http://localhost:8080/h2-console/

### Actuator link:
http://localhost:8080/actuator

### Get by ID URL:
`GET localhost:8080/nace/api/orders/1`

### Save new URL:
`POST localhost:8080/nace/api/orders/save`

Example of JSON body:
```
{
    "order": 1,
    "level": 2,
    "code": "B",
    "parent": "A",
    "description": "asdfg qwe tert fg",
    "inc": "twret wretwe rt rwet wertw ert wert  fggsfg",
    "also": "fgdfg",
    "ref": "111.444",
    "excl": "no",
    "rulings": "r1"
}
```