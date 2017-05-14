package com.project.module.dao;

import org.springframework.stereotype.Component;

import com.project.module.pojo.User;

@Component
public interface IUserDao {
	public User selectByPrimaryKey(int id);
}
