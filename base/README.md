# 基础模块

提供一些基础功能
- [X] nexus
- [X] 入库操作
- [X] ~~spring-doc~~swagger2
- [ ] redis实现数据库二级缓存
- [X] 定时任务
- [ ] 热部署
- [X] Enjoy
- [ ] redis 实现统计页面点击量（get请求刷数据）
- [ ] 将数据库由 druid 切换到 西咖喱

## 踩坑
在启动服务时总是报错：注入sqlFactory失败，mp和代码生成器的版本不一致所导致。
根据官方文档提供的最新对应版本解决该问题

本项目使用的是 MybatisPlus和模板工具类为3.2.0,SpringBoot2.2.1,数据库中的Date类型对应的java实体类的LocalDate，
查询时报错：java.sql.SQLFeatureNotSupportedException
查询官网暂未找到合适的解决方案，只能手动将LocalDate改为Date，或者依照网友的推荐来降低MP的版本
目前已给官方提交issue，等待后续回复

目前依赖了spring默认的quartz时，启动提示我
```
  Scheduler class: 'org.quartz.core.QuartzScheduler' - running locally.
  NOT STARTED.
  Currently in standby mode.
  Number of jobs executed: 0
  Using thread pool 'org.quartz.simpl.SimpleThreadPool' - with 10 threads.
  Using job-store 'org.quartz.simpl.RAMJobStore' - which does not support persistence. and is not clustered.
```
暂时为研究明白它的线程池如何使用

当只是使用[基础的定时任务](https://github.com/MrTallon/191130/blob/master/base/src/main/java/com/base/utils/QuartzUtil.java)功能时，不需要添加依赖依赖
日后仔细研究quartz的功能

[Enjoy 模板引擎](http://www.jfinal.com/share/457)
[Enjoy 官方文档](https://www.jfinal.com/doc/6-10)



## 后续

学习使用[热部署](https://www.jdon.com/50644)及相关知识

学习使用一下 spring-doc

[整理](https://blog.csdn.net/vhfdff/article/details/89048334)


验证 mybatisPlus 一级缓存，二级缓存

redis 缓存速度

redis 持久化和缺陷


