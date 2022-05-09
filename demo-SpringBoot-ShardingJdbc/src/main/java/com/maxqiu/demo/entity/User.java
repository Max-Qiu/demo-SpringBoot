package com.maxqiu.demo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 用户表
 *
 * @author Max_Qiu
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@TableName("user")
public class User extends Model<User> {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private Long id;

    /**
     * 姓名
     */
    @TableField("username")
    private String username;

    /**
     * 组
     */
    @TableField("group_id")
    private Integer groupId;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
