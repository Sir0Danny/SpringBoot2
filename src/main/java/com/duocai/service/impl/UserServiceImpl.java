package com.duocai.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.duocai.bean.User;
import com.duocai.mapper.UserMapper;
import com.duocai.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public Object listAll(int page, int size) {
		Page pageObj = new Page(page, size);
		return userMapper.selectPage(pageObj, null);
	}

	@Override
	public int insert(User user) {
		int ret = 0;
		try {
			ret = userMapper.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public int remove(Integer userId) {
		return userMapper.deleteById(userId);
	}

	@Override
	public int update(User user) {
		return userMapper.updateById(user);
	}
}
