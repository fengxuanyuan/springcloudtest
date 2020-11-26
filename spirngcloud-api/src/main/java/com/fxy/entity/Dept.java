package com.fxy.entity;
/*
 * @Description :
 * @projectName springcloudtest
 * @Author fengxuanyuan2010@foxmail.com
 * @Date 2020/11/26  20:01
 * @Version v1.0
 */

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor//无参构造函数
@Accessors(chain = true)//支持链式写法
public class Dept extends BaseEntity {
    private Long deptno;//主键
    private String dname;
    //这个数据数存在哪个数据库的字段~ 微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
