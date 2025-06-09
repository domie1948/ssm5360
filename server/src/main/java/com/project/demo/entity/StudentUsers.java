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
 * 学生用户：(StudentUsers)表实体类
 *
 */
@TableName("`student_users`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentUsers implements Serializable {

    // StudentUsers编号
    @TableId(value = "student_users_id", type = IdType.AUTO)
    private Integer student_users_id;

    // 学生学号
    @TableField(value = "`student_no`")
    private String student_no;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 院系
    @TableField(value = "`department`")
    private String department;
    // 性别
    @TableField(value = "`gender`")
    private String gender;
    // 年龄
    @TableField(value = "`age`")
    private Integer age;
    // 专业
    @TableField(value = "`major`")
    private String major;
    // 班级名称
    @TableField(value = "`class_name`")
    private String class_name;






    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
