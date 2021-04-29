# spring-cloud-demo
1. eureka-server

   注册中心

   http://127.0.0.1:8761/


2. eureka-client
   
   服务提供者

   本地访问：

   http://127.0.0.1:8070/hello
   
   http://127.0.0.1:8070/nice


3. eureka-consumer

   服务消费者
   
   DEMO访问地址: 
   
   http://127.0.0.1:8075/commonRequest (restTemplate 访问方式)
   
   http://127.0.0.1:8075/feignRequest (Feign 访问方式)

4. eureka-

   服务网关
   
   DEMO访问地址：

   http://127.0.0.1:8080/eureka-consumer/commonRequest
   
   http://127.0.0.1:8080/eureka-consumer/feignRequest

   http://127.0.0.1:8080/single-provider/hello

   http://127.0.0.1:8080/single-provider/nice
