# 使用一个基础的Java镜像
FROM openjdk:8-jre-alpine

# 设置工作目录
WORKDIR /app

# 将可执行的Spring Boot JAR文件复制到容器中
COPY target/demo01-1.0-SNAPSHOT.jar /app/app.jar

# 设置JVM参数，包括使用G1收集器和导出GC日志
ENV JAVA_OPTS="-XX:+UseG1GC -Xlog:gc*:file=/logs/gc.log"

# 创建日志文件夹，以便应用程序日志和GC日志都可以写入其中
RUN mkdir /logs

# 启动Spring Boot应用
CMD ["java", "-jar", "app.jar"]
