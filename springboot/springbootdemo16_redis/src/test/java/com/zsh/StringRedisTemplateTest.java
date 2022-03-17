package com.zsh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class StringRedisTemplateTest {
//    @Autowired
//    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void set(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("name","zsh");
    }

    @Test
    public void get(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        System.out.println(ops.get("name"));
    }


    @Test
    public void hset(){
        HashOperations<String, Object, Object> ops = stringRedisTemplate.opsForHash();
        ops.put("ahut","name","zsh");
    }

    @Test
    public void hget(){
        HashOperations<String, Object, Object> ops = stringRedisTemplate.opsForHash();
        System.out.println(ops.get("ahut", "name"));

    }

}
