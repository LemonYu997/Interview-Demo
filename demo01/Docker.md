执行以下命令来构建Docker镜像，确保Docker已安装并在项目根目录中执行：

```shell
docker build -t demo01-app .
```

使用以下命令来运行Docker容器：

```shell
docker run --name demo01-app -d -p 8081:8081 -v /root/workspace/Demo01/logs:/logs demo01-app
```

在CentOS中，您可以使用docker cp命令从Docker容器复制文件到本地文件系统。
并且您的GC日志文件在容器中的路径为/app/gc.log，您可以使用以下命令将GC日志文件复制到本地目录：
/app/gc.log 替换为GC日志文件在容器中的路径，
/root/workspace/Demo01/logs/ 替换为您希望将文件复制到的本地路径。
```shell
docker cp demo01-app:/app/gc.log /root/workspace/Demo01/logs/
```

查看运行日志
```shell
 docker logs -f demo01-app
```