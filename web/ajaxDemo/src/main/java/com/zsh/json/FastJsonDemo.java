package com.zsh.json;

import com.alibaba.fastjson.JSON;

public class FastJsonDemo {
    public static void main(String[] args) {
        //1将一个java的对象转为json字符串
        User user=new User(1,"zhangsan","123");
        String s = JSON.toJSONString(user);
        System.out.println(s);

        User user1 = JSON.parseObject(s, User.class);
        System.out.println(user1.toString());
        //2将JSON字符串转为java对象
    }
}
