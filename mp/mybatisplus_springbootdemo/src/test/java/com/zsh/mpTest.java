package com.zsh;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsh.domain.User;
import com.zsh.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class mpTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void test1(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testInsert(){
        User user = new User("zsh", "123456", 24, "2414399808@qq.com");
        int zsh = userMapper.insert(user);
        System.out.println(zsh);
        System.out.println(user.getId());
    }

    @Test
    public void testUpdateCondition(){
        User user=new User();
        user.setAge(20);
        user.setPassword("1111111");
        QueryWrapper<User> qw=new QueryWrapper<>();
        qw.eq("user_name","wangwu");
        userMapper.update(user,qw);

    }

    @Test
    public void testUpdateCondition2(){
        UpdateWrapper<User> uw=new UpdateWrapper<>();
        uw.set("age",25).set("password","2222222").eq("user_name","wangwu");
        userMapper.update(null,uw);


    }

    @Test
    public void testDeleteById(){
        int i = userMapper.deleteById(6);
        System.out.println(i);
    }
    @Test
    public void testDeleteByMap(){
        Map<String,Object> map=new HashMap<>();

        map.put("user_name","zsh");
        map.put("password","123456");
        int i = userMapper.deleteByMap(map);
        System.out.println(i);
    }

    @Test
    public void testDelete(){
        //方法一
//        QueryWrapper<User> qw=new QueryWrapper<>();
//        qw.like("user_name","zs");
        //方法二
        User user=new User();
        user.setUserName("zsh");
        QueryWrapper<User> qw=new QueryWrapper<>(user);
        userMapper.delete(qw);
    }

    @Test
    public void testDeleteBatchIds(){
        userMapper.deleteBatchIds(Arrays.asList(8,9));
    }


    @Test
    public void testSelectPage(){
        IPage<User> page = new Page<>(1,5);
        IPage<User> userIPage = userMapper.selectPage(page, null);
        System.out.println(userIPage.getRecords());
    }
}
