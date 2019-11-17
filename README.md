 **xfBlog** 一个简洁美观、功能强大并且自适应的Java博客。使用springboot开发，前端使用Bootstrap。支持移动端自适应，配有完备的前台和后台管理功能。    

![JDK](https://img.shields.io/badge/JDK-1.8-green.svg)
![Maven](https://img.shields.io/badge/Maven-3.3.1-green.svg)
![MySQL](https://img.shields.io/badge/MySQL-5.6.4-green.svg)
![Redis](https://img.shields.io/badge/Redis-3.0.503-green.svg)

# 功能简介

- **评论系统**：自研的评论系统，支持显示用户地址、浏览器和os信息，后台可审核评论、开启匿名评论、回复和邮件通知评论
- **权限管理**：后台配备完善的权限管理
- **实时通讯**：管理员可向在线的用户发送实时消息

----

# 模块划分

| 模块  | 释义 | 备注 |
| :------------: | :------------: | :------------: |
| blog-core | 核心业务类模块，提供基本的数据操作、工具处理等 | 该模块只是作为核心依赖包存在 |
| blog-admin | 后台管理模块 | 该模块作为单独项目打包部署 |
| blog-web | 前台模块 | 该模块作为单独项目打包部署 |
| blog-file | 文件存储功能模块 


# 技术栈

- Springboot 2.0.8
- Apache Shiro 1.2.2
- Logback
- Redis
- Lombok
- Websocket
- MySQL、Mybatis、Mapper
- Freemarker
- Bootstrap 3.3.0
- jQuery 1.11.1、jQuery Lazyload 1.9.7、fancybox、iCheck
- ...




