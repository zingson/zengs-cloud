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

## Cloud API URL

项目信息查看接口与URL记录

### actuator

路径 |   说明
-----|------
/actuator/info               |返回info前缀的自定义配置信息，默认是空
/actuator/health             |服务状态：{"status":"UP"} 
/actuator/configprops        |配置信息查看
/actuator/mappings           |返回所有SpringMvc映射
/actuator/metrics/           |使用内存查询 /actuator/metrics/jvm.memory.used

更多请参考spring-boot-actuator模块说明文档


### config 


路径 |   说明
-----|------
/{name}-{profiles}.properties               |获取配置指定属性值  


## 接口文档 Swagger2

