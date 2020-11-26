package com.fxy.springcloud.dao;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/11/26  20:14
 * @Version v1.0
 */


import com.fxy.entity.Dept;

import java.util.List;

public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
