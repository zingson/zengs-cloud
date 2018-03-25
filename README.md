# zengs-cloud

Spring cloud 项目搭建基础模板。


## 项目规范

项目统一采用UTF-8编码。


## 模块说明

`cloud`开头的表示基础通用模块微服务，`service` 开头的表示业务模块微服务，`_`开发表示文档或者配置信息。

- `_config` 存储各微服务配置文件，正式环境使用单独Git项目管理；
- `cloud-config` 配置管理中心服务；
- `cloud-eureka` 服务注册中心；
- `cloud-gateway` 项目网关；
- `service-apidoc` 接口文档管理服务；

