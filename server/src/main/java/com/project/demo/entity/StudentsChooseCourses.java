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
 * 学生选课：(StudentsChooseCourses)表实体类
 *
 */
@TableName("`students_choose_courses`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentsChooseCourses implements Serializable {

    // StudentsChooseCourses编号
    @TableId(value = "students_choose_courses_id", type = IdType.AUTO)
    private Integer students_choose_courses_id;

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
    // 起止周次
    @TableField(value = "`start_and_end_weeks`")
    private String start_and_end_weeks;
    // 学时
    @TableField(value = "`credit_hours`")
    private String credit_hours;
    // 学分
    @TableField(value = "`credit`")
    private String credit;
    // 学生学号
    @TableField(value = "`student_no`")
    private Integer student_no;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 选课人数
    @TableField(value = "`number_of_participants`")
    private String number_of_participants;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
