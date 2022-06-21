# demo

> demo项目是dubbo3(java)官方案例修改的一个版本，删掉了zookeeper并提供grpc协议端口的服务。

图文指导：

https://my.oschina.net/randolphcyg/blog/5542229

环境信息：

- java 1.8.0_333
- maven 3.8.6
- dubbo 3.0.8

## 1. 怎么跑起来

1. IDEA配置好maven，用内置的也行
2. 点击maven-插件-protobuf-protobuf:compile 会根据`src/main/proto/demo.proto`编译出代码桩到`/build`目录下
3. 然后项目根目录`mvn compile`编译项目，检查`/src/java下面的代码依赖没报错`即可运行`src/main/java/org/apache/dubbo/demo/provider/Application.java`

## 2. 注意点

- `pom.xml`里面是依赖，直接拿dubbo官方demo并修改的
- `src/main/resources/spring/demo.xml`里面不使用注册中心、注册了grpc的服务和端口
- 其他配置文件不重要、不用管
- 如果修改了protobuf文件，`/build`目录下的代码桩都要记得用插件编译更新下
- go这边的pb文件也要同步修改接口并重新生成go代码桩

go语言的protobuf文件：

```shell
syntax = "proto3";

option go_package="./demopb";

package demopb;

// 请求体
message HelloRequest {
  string name = 1;
}

// 响应体
message HelloReply {
  string message = 1;
}

// The demo service definition.
service demoService {
  rpc SayHello (HelloRequest) returns (HelloReply) {}
}
```
