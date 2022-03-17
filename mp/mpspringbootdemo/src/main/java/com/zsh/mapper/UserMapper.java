package com.zsh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public interface UserMapper extends BaseMapper<SecurityProperties.User> {

}
