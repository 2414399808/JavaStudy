package com.zsh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userName;
    //@TableField(select = false)//表示该字段在查询数据库时不会被查询到
    private String password;
    private Integer age;
    @TableField("email")//指定数据库表中的字段名
    private String mail;

    @TableField(exist = false)//表示当前字段在数据库中不存在
    private String address;

    public User(String userName, String password, Integer age, String mail) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mail = mail;
    }
}
