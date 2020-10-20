# docker-springboot-demo
Demo project for Spring Boot and Postgres with Docker

Build the project with 
 - mvn clean install

to generate the fat jar file


Then run  
$ docker-compose build --no-cache my-webapp

$ docker-compose up (--detach)

Application is accessible on port 8088, users table and data is auto configured via liquibase.

Navigate to 
 - http://{Your_Docker_Host_IP}:8088/users 
 
to retrieve the list of users


Medium article:
https://medium.com/dev-jam/docker-in-a-nutshell-f2e315211195

<!-- 
Stand alone postgres (not needed anymore since we configure it in docker-compose.yml)
$ docker run --name postgres_db -e POSTGRES_USER=root -e POSTGRES_PASSWORD=root -e POSTGRES_DB=users-db -d -p 5432:5432 postgres
-->
