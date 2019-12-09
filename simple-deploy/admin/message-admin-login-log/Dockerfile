FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
ADD gateway.jar /message-admin-login-log.jar
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","/message-admin-login-log.jar"]
