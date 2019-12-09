FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
ADD business-oauth2-service.jar /business-oauth2-service.jar
EXPOSE 9001
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","/business-oauth2-service.jar"]
