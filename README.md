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
- 5 Adding the file name into the pom.xml
```javascript
    // ... some tags here
    </plugins>
    
    <finalName>msjavaaws-docker</finalName>
</build>
```
- 6 Creating the Docker file
```dockerfile
FROM openjdk:17
EXPOSE 8080
ADD target/msjavaaws-docker.jar msjavaaws-docker.jar
ENTRYPOINT ["java", "-jar", "/msjavaaws-docker.jar"]
```
- 7 Executing the follow steps to create an image into the [DockerHub - angelozer/msjavaaws-docker](https://hub.docker.com/repository/docker/angelozero/msjavaaws-docker/general)
  - generate the image: docker build -t msjavaaws-docker .
  - testing the image: docker run -p 9090:8080 msjavaaws-docker
  - generate the tag to be pushed: docker tag msjavaaws-docker:latest angelozero/msjavaaws-docker
  - docker push angelozero/msjavaaws-docker

- 8 - Project Stack
![stack_project](https://i.postimg.cc/1tHxBNW6/Whats-App-Image-2023-06-28-at-22-12-29.jpg)