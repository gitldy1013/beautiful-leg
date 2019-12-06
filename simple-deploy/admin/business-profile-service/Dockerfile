FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
ADD business-profile-service.jar /business-profile-service.jar
EXPOSE 9001 8888
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","/business-profile-service.jar"]
