FROM tomcat:8.5

LABEL version="0.0.1" 

RUN useradd tomcat



COPY ./webapps/greeting-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/greeting-server.war


RUN mkdir /var/log/tomcat8/
RUN chown -R tomcat:tomcat /var/log/tomcat8/


RUN mkdir /var/log/spring
RUN chown -R tomcat:tomcat /var/log/spring/


RUN chown -R tomcat:tomcat  /usr/local/tomcat/webapps/



EXPOSE 8080

USER tomcat