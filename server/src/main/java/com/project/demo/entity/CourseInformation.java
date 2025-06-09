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
 * 课程信息：(CourseInformation)表实体类
 *
 */
@TableName("`course_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseInformation implements Serializable {

    // CourseInformation编号
    @TableId(value = "course_information_id", type = IdType.AUTO)
    private Integer course_information_id;

    // 课程编号
    @TableField(value = "`course_no`")
    private String course_no;
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 任课教师
    @TableField(value = "`teacher`")
    private Integer teacher;
    // 院系
    @TableField(value = "`department`")
    private String department;
    // 专业
    @TableField(value = "`major`")
    private String major;
    // 学时
    @TableField(value = "`credit_hours`")
    private String credit_hours;
    // 学分
    @TableField(value = "`credit`")
    private String credit;
    // 起止周次
    @TableField(value = "`start_and_end_weeks`")
    private String start_and_end_weeks;
    // 开设学期
    @TableField(value = "`opening_semester`")
    private String opening_semester;
    // 选课控制
    @TableField(value = "`course_selection_control`")
    private String course_selection_control;
    // 先修课
    @TableField(value = "`prerequisites`")
    private String prerequisites;
    // 第一次上课时间
    @TableField(value = "`first_class_time`")
    private String first_class_time;
    // 第一次上课地点
    @TableField(value = "`place_of_the_first_class`")
    private String place_of_the_first_class;
    // 第二次上课时间
    @TableField(value = "`second_class_time`")
    private String second_class_time;
    // 第二次上课地点
    @TableField(value = "`location_of_the_second_class`")
    private String location_of_the_second_class;
    // 下限人数
    @TableField(value = "`minimum_number_of_people`")
    private Integer minimum_number_of_people;
    // 上限人数
    @TableField(value = "`maximum_number_of_people`")
    private Integer maximum_number_of_people;
    // 已选课人数
    @TableField(value = "`number_of_courses_selected`")
    private Integer number_of_courses_selected;
    // 课程内容
    @TableField(value = "`course_content`")
    private String course_content;
    // 课程要求
    @TableField(value = "`course_requirements`")
    private String course_requirements;
    // 课程任务
    @TableField(value = "`course_tasks`")
    private String course_tasks;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
