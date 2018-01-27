Scratch RPC
===========
![https://travis-ci.org/classtag/scratch_rpc](https://img.shields.io/travis/classtag/scratch_rpc.svg)

Spring + Netty + Protostuff + ZooKeeper 实现了一个轻量级 RPC 框架，使用 Spring 提供依赖注入与参数配置，使用 Netty 实现 NIO 方式的数据传输，使用 Protostuff 实现对象序列化，使用 ZooKeeper 实现服务注册与发现。使用该框架，可将服务部署到分布式环境中的任意节点上，客户端通过远程接口来调用服务端的具体实现，让服务端与客户端的开发完全分离，为实现大规模分布式应用提供了基础支持。

## TODO LIST
- [ ] add metrics.
- [ ] support pool




