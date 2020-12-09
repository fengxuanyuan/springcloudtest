package com.fxy.springcloud;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/11/26  20:28
 * @Version v1.0
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.fxy.springcloud.dao.**")//扫描dao的包，会自动映射到mapper文件
//@EnableEurekaClient//会自动注册到eureka注册中心去     --很多教学视频会加上这个注解，但是通过阅读官方文档，是不需要这个注解也是可以的https://docs.spring.io/spring-cloud-netflix/docs/2.2.6.BUILD-SNAPSHOT/reference/html/#service-discovery-eureka-clients
public class DeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication.class,args);
    }
}
