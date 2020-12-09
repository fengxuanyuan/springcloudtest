package com.fxy.controller;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/12/7  16:18
 * @Version v1.0
 */

import com.fxy.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //这里是没有做负载均衡的，只到某个固定ip及端口访问某个服务
    // private static final String REMOTE_ADDR = "http://localhost:8081";

    private static final String REMOTE_ADDR = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/add")
    public boolean add(Dept dept){
       return restTemplate.postForObject(REMOTE_ADDR+"/dept/add/",dept,Boolean.class);
    }

    @RequestMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REMOTE_ADDR+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REMOTE_ADDR+"/dept/list",List.class);
    }
}
