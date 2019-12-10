FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
ADD cloud-upload-service.jar /cloud-upload-service.jar
EXPOSE 10001
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","/cloud-upload-service.jar"]
