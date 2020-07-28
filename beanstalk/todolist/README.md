# Spring/mysql todolist app
Simple java/spring/mysql app to deploy on beanstalk (or create all infra separately with cloudformation) to test how beanstalk works.


### Deploy & Run
1. Build jar file (see command below) and upload this jar to beanstalk (don't forget configure to create mysql db during beanstalk setup).
2. Create beanstalk app (select sample app + configure mysql db)
3. Wait till db created and go to env and add all 5 env variables. Port can't be 80, cause it's taken by nginx.
```
APP_PORT=8080
DB_HOST={rds_endpoint}
DB_NAME=ebdb
DB_USERNAME=root
DB_PASSWORD=12345678
```
4. Save env vars and upload your jar file

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

# run jar file (we should use sudo, otherwise we get exception java.net.SocketException: Permission denied)
sudo java -DAPP_PORT=80 -DDB_HOST=localhost -DDB_NAME=todolist -DDB_USERNAME=root -DDB_PASSWORD= -jar target/todolist-0.0.1-SNAPSHOT.jar
```