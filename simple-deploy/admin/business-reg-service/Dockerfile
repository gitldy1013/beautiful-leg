FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
ADD business-reg-service.jar /business-reg-service.jar
EXPOSE 9000
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","/business-reg-service.jar"]
