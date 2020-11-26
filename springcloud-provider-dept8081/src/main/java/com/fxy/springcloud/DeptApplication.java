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

@SpringBootApplication
@MapperScan("com.fxy.springcloud.dao.**")
public class DeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication.class,args);
    }
}
