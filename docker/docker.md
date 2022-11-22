# docker

# Sample Spring Boot Server

- dockerize application with docker compose

- create java app

- create jar
  mvn clean package -DskipTests
- run jar
  java -jar gitops-server-1.0-SNAPSHOT.jar
- create local repo (git)
- create remote repo (github)
- push local repo to remote repo

- create docker file
- create docker image
  docker build -t cosminbucur/gitops-server:1.0 .

- create and run container
  docker run --name cosminbucur/gitops-server -p 8081:8081

- test post in db
  curl -X POST -H "Content-Type: application/json" \
  -d '{"id":"null", "name":"first product"}' \
  http://localhost:8081/products

