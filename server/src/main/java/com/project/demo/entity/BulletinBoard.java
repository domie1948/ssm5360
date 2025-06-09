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
 * 公告栏：(BulletinBoard)表实体类
 *
 */
@TableName("`bulletin_board`")
@Data
@EqualsAndHashCode(callSuper = false)
public class BulletinBoard implements Serializable {

    // BulletinBoard编号
    @TableId(value = "bulletin_board_id", type = IdType.AUTO)
    private Integer bulletin_board_id;

    // 标题
    @TableField(value = "`title`")
    private String title;
    // 发布人
    @TableField(value = "`publisher`")
    private String publisher;
    // 内容
    @TableField(value = "`publishing_content`")
    private String publishing_content;
    // 相关附件
    @TableField(value = "`relevant_accessories`")
    private String relevant_accessories;









    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
