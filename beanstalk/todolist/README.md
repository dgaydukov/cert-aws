# Spring/mysql todolist app


### Console commands
```
# get all items
curl localhost:8080/api/todo

# create new item
curl -H "Content-type: application/json" -d '{"name":"do it", "date":"2020-01-01"}' localhost:8080/api/todo

# run app with maven
mvn spring-boot:run

# build (package) product into fat jar file
mvn clean package -DskipTests

# run jar file
java -DAPP_PORT=80 -DDB_HOST=localhost -DDB_NAME=todolist -DDB_USERNAME=root -DDB_PASSWORD= -jar target/todolist-0.0.1-SNAPSHOT.jar
```