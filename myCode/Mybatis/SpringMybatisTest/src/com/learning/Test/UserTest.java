package com.learning.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learning.DAO.IUserDao;
import com.learning.Entities.User;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring.xml")
public class UserTest {
	@Autowired
	private IUserDao userDao;
	@Test
	public void userSelectTest(){
		User user=userDao.getByID("1");
		System.out.println(user.getUserName());
		user.setUserName("dingfang");
		System.out.println(user.getUserName());
		System.out.println(user.getUserID());
	}
}
