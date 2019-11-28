FROM openjdk:8

ENV SENTINEL_HOME /opt/sentinel-dashboard

RUN mkdir -p ${SENTINEL_HOME}

COPY sentinel-dashboard.jar ${SENTINEL_HOME}

RUN chmod -R +x ${SENTINEL_HOME}/*jar

WORKDIR ${SENTINEL_HOME}

EXPOSE 8080

CMD java ${JAVA_OPTS} -jar sentinel-dashboard.jar