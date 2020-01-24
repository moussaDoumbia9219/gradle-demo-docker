FROM tomcat:9.0

LABEL maintainer="moussa.doumbia@realestate.bnpparibas"

ADD build/libs/gradle-world-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8888

CMD ["catalina.sh", "run"]