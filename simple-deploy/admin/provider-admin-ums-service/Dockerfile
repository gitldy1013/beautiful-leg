FROM openjdk:8-alpine
MAINTAINER ldy "13691363167@163.com"
COPY provider-admin-ums-service.jar /provider-admin-ums-service.jar
RUN chmod 777 /*.jar
ENTRYPOINT ["java","-jar","-Dcsp.sentinel.api.port=8720", "-Dproject.name=ums-admin-provider", "-Dcsp.sentinel.dashboard.server=leg.liudongyang.top:8718","/provider-admin-ums-service.jar"]
