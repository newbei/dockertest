# jdk 是一个已有的包含 jdk 的镜像
FROM openjdk:8u121-jdk
 
#  作者签名
MAINTAINER NEWBEI
 
#  简化 jar 的名字路径 （#：表示注释掉）
COPY caller-1.0-SNAPSHOT.jar /app.jar
 
#  执行 java -jar 命令 （CMD：在启动容器时才执行此行。RUN：构建镜像时就执行此行）
CMD java -jar /app.jar
 
#  设置对外端口为 8089
EXPOSE 10000

