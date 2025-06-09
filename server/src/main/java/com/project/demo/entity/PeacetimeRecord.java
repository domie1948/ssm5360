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
 * 平时记录：(PeacetimeRecord)表实体类
 *
 */
@TableName("`peacetime_record`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PeacetimeRecord implements Serializable {

    // PeacetimeRecord编号
    @TableId(value = "peacetime_record_id", type = IdType.AUTO)
    private Integer peacetime_record_id;

    // 课程编号
    @TableField(value = "`course_no`")
    private String course_no;
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 任课教师
    @TableField(value = "`teacher`")
    private Integer teacher;
    // 开设学期
    @TableField(value = "`opening_semester`")
    private String opening_semester;
    // 学生学号
    @TableField(value = "`student_no`")
    private Integer student_no;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 考勤
    @TableField(value = "`check_work_attendance`")
    private String check_work_attendance;
    // 作业
    @TableField(value = "`task`")
    private String task;
    // 测验
    @TableField(value = "`test`")
    private String test;
    // 平时成绩
    @TableField(value = "`peacetime_performance`")
    private String peacetime_performance;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
