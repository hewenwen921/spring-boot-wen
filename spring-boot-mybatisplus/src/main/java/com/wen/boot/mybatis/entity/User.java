package com.wen.boot.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "User")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;

    //    @TableField("user_name")
    private String userName;
    private String phone;
    private int age;
    private String education;
    private String sex;
    private String likes;
}
