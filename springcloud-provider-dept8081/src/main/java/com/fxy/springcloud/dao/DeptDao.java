package com.fxy.springcloud.dao;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/11/26  20:14
 * @Version v1.0
 */


import com.fxy.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/*@Mapper //如果在启动类上面加上了mapperscan注解，就不需要这两个注解了
@Repository*/
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
