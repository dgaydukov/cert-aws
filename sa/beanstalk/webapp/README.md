# Simple SpringBoot webapp with tests
You can use it with ci/cd pipeline (you can also deploy it on beanstalk)

# Development
You should import this folder `/beanstal/webapp` into IntelliJ as maven project (`.idea/target` dirs already included into `.gitignore`).
In this case you can develop/run app from IntelliJ and work with it just like with any other spring boot project.

### Console commands to build
```
# get all items
curl localhost:8080/api/todo
# create new item
curl -H "Content-type: application/json" -d '{"name":"do it", "date":"2020-01-01"}' localhost:8080/api/todo

# run app with maven
mvn spring-boot:run

# build (package) product into fat jar file
mvn clean package
# run jar file (we should use sudo, otherwise we get exception java.net.SocketException: Permission denied)
sudo java -jar target/webapp-0.0.1-SNAPSHOT.jar
```