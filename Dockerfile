FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/puzzleGame-back-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 设置默认端口
ENV JAVA_OPTS=""
EXPOSE 8080

# 启动 jar 包
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
