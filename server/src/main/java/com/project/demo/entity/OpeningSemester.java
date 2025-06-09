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
 * 开设学期：(OpeningSemester)表实体类
 *
 */
@TableName("`opening_semester`")
@Data
@EqualsAndHashCode(callSuper = false)
public class OpeningSemester implements Serializable {

    // OpeningSemester编号
    @TableId(value = "opening_semester_id", type = IdType.AUTO)
    private Integer opening_semester_id;

    // 开设学期
    @TableField(value = "`opening_semester`")
    private String opening_semester;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
