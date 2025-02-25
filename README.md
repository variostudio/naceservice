# NACE service

## Features of project:
* Possible build abd run as with IntelliJ Idea as standalone JAR (`target/NaceService-1.jar`)
* H2 in-memory database is used as main database + H2 console to verify data. Used `data.sql` and `schema.sql` to initialize H2. It is easy to change for any production-ready database.
* SWAGGER UI is used for user friendly calls
* Caffeine cache is used for performance improvement
* Java, SpringBoot, SpringBoot JPA, Spring Web and so on 
* The Mock (`NaceServiceTest`) and the integration test (`IntegrationTest`) are in place. Integration test is used second H2 database.

### Build and Run:
Use `mvn clean install`
And run the main class: `NaceRunner` or run `target/NaceService-1.jar`

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
