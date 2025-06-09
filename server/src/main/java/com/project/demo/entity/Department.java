package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 院系：(Department)表实体类
 *
 */
@TableName("`department`")
@Data
@EqualsAndHashCode(callSuper = false)
public class Department implements Serializable {

    // Department编号
    @TableId(value = "department_id", type = IdType.AUTO)
    private Integer department_id;

    // 院系
    @TableField(value = "`department`")
    private String department;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
