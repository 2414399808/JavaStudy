package com.zsh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsh.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
