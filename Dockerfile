FROM java:8
MAINTAINER "william"<952408421@qq.com>
ADD hello.jar app.jar
EXPOSE 8080
CMD java -jar app.jar