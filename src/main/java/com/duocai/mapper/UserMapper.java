package com.duocai.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.duocai.bean.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
