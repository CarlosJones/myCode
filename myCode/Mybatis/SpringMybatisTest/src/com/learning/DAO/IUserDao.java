package com.learning.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learning.Entities.User;
@Repository
@Transactional
public interface IUserDao {
	public User getByID(String ID);
	public void updateUser(User user);
}
