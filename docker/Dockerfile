# pull a base image with java
FROM amazoncorretto:11.0.17

ENV PORT 8081
EXPOSE 8081

# copy jar (use semantic versioning)
COPY target/gitops-server-1.0.0-SNAPSHOT.jar server-1.0.0.jar

# define entrypoint
ENTRYPOINT ["java","-jar","/server-1.0.0.jar"]
