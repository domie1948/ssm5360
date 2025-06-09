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
 * 学生退课：(StudentsDropOutOfClass)表实体类
 *
 */
@TableName("`students_drop_out_of_class`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentsDropOutOfClass implements Serializable {

    // StudentsDropOutOfClass编号
    @TableId(value = "students_drop_out_of_class_id", type = IdType.AUTO)
    private Integer students_drop_out_of_class_id;

    // 课程编号
    @TableField(value = "`course_no`")
    private String course_no;
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 任课教师
    @TableField(value = "`teacher`")
    private Integer teacher;
    // 学生学号
    @TableField(value = "`student_no`")
    private Integer student_no;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 退课时间
    @TableField(value = "`withdrawal_time`")
    private Timestamp withdrawal_time;
    // 退课原因
    @TableField(value = "`reason_for_withdrawal`")
    private String reason_for_withdrawal;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;






    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
