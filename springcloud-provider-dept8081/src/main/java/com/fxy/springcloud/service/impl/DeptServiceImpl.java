package com.fxy.springcloud.service.impl;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/11/26  20:15
 * @Version v1.0
 */


import com.fxy.entity.Dept;
import com.fxy.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Override
    public boolean addDept(Dept dept) {
        return false;
    }

    @Override
    public Dept queryById(Long id) {
        return null;
    }

    @Override
    public List<Dept> queryAll() {
        return null;
    }
}
