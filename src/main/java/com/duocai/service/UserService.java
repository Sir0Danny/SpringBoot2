package com.duocai.service;

import com.duocai.bean.User;

public interface UserService {
	Object listAll(int page, int size);

	int insert(User user);

	int remove(Integer userId);

	int update(User user);
}
