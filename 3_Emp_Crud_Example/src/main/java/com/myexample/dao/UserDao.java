package com.myexample.dao;

import com.myexample.entity.User;

public interface UserDao {

	public int saveUser(User user);

	public User loginUser(String email, String passsword);
}