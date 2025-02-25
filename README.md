# NACE service

### Build
Use `mvn clean install`

### Run the class
`NaceRunner`

### SWAGGER UI:
http://localhost:8080/swagger-ui/index.htm

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