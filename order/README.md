# 订单模块

初步实现 WebFlux

WebFlux 相对 MVC 一样重要。大多数场景使用 MVC 都是阻塞式的，WebFlux 使用的场景是异步非阻塞的。

响应式编程是基于异步和事件驱动的非阻塞程序，只是垂直通过在 JVM 内启动少量线程扩展，而不是水平通过集群扩展。

对于 IO 密集型等场景，可以使用 WebFlux 去实现，提高资源利用率。

了解 WebFlux ,首先了解下什么是 Reactive Streams。Reactive Streams 是 JVM 中面向流的库标准和规范：

- 处理可能无限数量的元素
- 按顺序处理
- 组件之间异步传递
- 强制性非阻塞背压（Backpressure）

2.1 Backpressure(背压)

背压是一种常用策略，使得发布者拥有无限制的缓冲区存储元素，用于确保发布者发布元素太快时，不会去压制订阅者。

2.2 Reactive Streams（响应式流）

一般由以下组成：

- 发布者：发布元素到订阅者
- 订阅者：消费元素
- 订阅：在发布者中，订阅被创建时，将与订阅者共享
- 处理器：发布者与订阅者之间处理数据