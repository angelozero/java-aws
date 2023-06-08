# ms-java-aws
Microservices + Java + AWS

- 1 - Creating the initial structure of the project with [Spring Initializr](https://start.spring.io/)
- 2 - Download the [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
- 3 - Download [Docker](https://www.docker.com/products/docker-desktop/)
- 4 - Create a simple test controller
```java
@Slf4j
@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/foo/{name}")
    public ResponseEntity<String> test(@PathVariable String name) {
        log.info("\nName info: {}\n", name);
        return ResponseEntity.ok(name);
    }
}
```
- 5 