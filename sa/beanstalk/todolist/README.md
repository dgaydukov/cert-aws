# Spring/mysql todolist app
Simple java/spring/mysql app to deploy on beanstalk (or create all infra separately with cloudformation) to test how beanstalk works.

# Development
You should import this folder `/beanstal/todolist` into IntelliJ as maven project (`.idea/target` dirs already included into `.gitignore`).
In this case you can develop/run app from IntelliJ and work with it just like with any other spring boot project.

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
** If you update env vars after you create your app, you may get errors. This is because beanstalk can't restart ec2. Try to manually terminate ec2 and update env vars. In this case beanstalk will create new ec2 with updated env vars.

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