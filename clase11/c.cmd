rm -rf \opt\apache-tomcat-9.0.64\webapps\ROOT\
rm -rf \opt\apache-tomcat-9.0.64\webapps\ROOT.war
/opt/apache-maven-3.8.4/bin/mvn clean install -DskipTests
