FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
ADD provider-admin-login-log-service.jar /provider-admin-login-log-service.jar
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","-Djava.net.preferIPv4Stack=true", "-Dcsp.sentinel.api.port=8720", "-Dproject.name=ums-admin-provider", "-Dcsp.sentinel.dashboard.server=leg.liudongyang.top:8718", "/provider-admin-login-log-service.jar"]
