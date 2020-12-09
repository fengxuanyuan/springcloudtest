package com.fxy.config;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/12/7  16:21
 * @Version v1.0
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //相当于spring.xml配置文件
public class SpringConfig {

    @Bean
    @LoadBalanced//ribban服务实现负载均衡注解
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
