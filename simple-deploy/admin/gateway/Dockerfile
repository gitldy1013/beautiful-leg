FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
ADD gateway.jar /gateway.jar
EXPOSE 8888
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]
