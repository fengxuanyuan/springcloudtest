package com.fxy.springcloud.controller;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/11/26  20:14
 * @Version v1.0
 */


import com.fxy.entity.Dept;
import com.fxy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    //获取一些配置的信息，得到具体的微服务！
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if (dept==null){
            throw new RuntimeException("Fail");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
