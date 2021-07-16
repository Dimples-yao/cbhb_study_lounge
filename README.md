# cbhb_study_lounge
渤海银行-萌新自习室

## 一 环境安装

开发环境

- java 1.8
- maven
- git
- tomcat
- mysql
- vue

开发软件

- IDEA
- mysql客户端

## 二 项目部署

#### MySQL初始化

建表语句

```mysql
CREATE TABLE `user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(64) NOT NULL DEFAULT '' COMMENT '姓名',
  `sex` tinyint NOT NULL DEFAULT '0' COMMENT '性别:0男1女',
  `phone` varchar(32) NOT NULL DEFAULT '' COMMENT '加密手机号',
  `password` varchar(64) NOT NULL DEFAULT '' COMMENT '登录密码',
  `cultural_level` tinyint NOT NULL DEFAULT '0' COMMENT '学历水平:0无1小学2初中3高中4专科5本科6研究生7博士',
  `ctime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `mtime` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户基础信息表';
```

添加数据语句

```mysql
INSERT INTO `user` (`name`, `sex`, `phone`, `password`, `cultural_level`)
VALUES
	('张三', 0, '13731650211', '123456', 7),
	('李四', 0, '15620613962', '123456', 6);
```

#### 项目启动

1. 修改jdbc.properties,改为自己数据库的地址
2. 配置Tomcat启动
3. 在浏览器中输入`http://localhost:8080/cbhb_study_lounge/user/all`,若能看到用户数据,则表示启动成功.数据内容如下
```json
[
  {
    "id": 1,
    "password": "123456",
    "name": "张三",
    "phone": "13731650211",
    "sex": 0,
    "culturalLevel": 7
  },
  {
    "id": 2,
    "password": "123456",
    "name": "李四",
    "phone": "15620613962",
    "sex": 0,
    "culturalLevel": 6
  }
]
```

## 三 参考资料

#### 环境搭建资料

+ [idea配置tomcat的方法](https://blog.csdn.net/LT_1029/article/details/87972919)

#### 学习资料

+ Spring框架学习
    - [基础](https://www.jianshu.com/p/00d67a878001)
    - [IOC上](https://www.jianshu.com/p/fc4b915b01df)
    - [IOC下](https://www.jianshu.com/p/2dae9702d142)
    - [AOP](https://www.jianshu.com/p/fe2a1eebfd17)
    - [JDBC模板&Spring事务管理](https://www.jianshu.com/p/08956e4977a7)
    - [SpringMVC](https://www.jianshu.com/p/5ead7ace9a06)
    - [搭建SSM](https://www.jianshu.com/p/1eda98e24ffc)
    - [SpringMVC2](https://www.jianshu.com/p/a9b05a440259)
+ [vue3教程](https://www.runoob.com/vue3/vue3-tutorial.html)
+ [SpringMVC返回JSON以及进阶](https://www.jianshu.com/p/02db299b1f3a)