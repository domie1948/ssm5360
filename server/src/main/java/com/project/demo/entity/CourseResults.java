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
 * 课程成绩：(CourseResults)表实体类
 *
 */
@TableName("`course_results`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseResults implements Serializable {

    // CourseResults编号
    @TableId(value = "course_results_id", type = IdType.AUTO)
    private Integer course_results_id;

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
    // 平时成绩
    @TableField(value = "`peacetime_performance`")
    private String peacetime_performance;
    // 平时占比
    @TableField(value = "`proportion_in_peacetime`")
    private String proportion_in_peacetime;
    // 考试成绩
    @TableField(value = "`examination_results`")
    private String examination_results;
    // 考试占比
    @TableField(value = "`examination_proportion`")
    private String examination_proportion;
    // 总成绩
    @TableField(value = "`total_score`")
    private String total_score;
    // 教师评语
    @TableField(value = "`teachers_comments`")
    private String teachers_comments;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
