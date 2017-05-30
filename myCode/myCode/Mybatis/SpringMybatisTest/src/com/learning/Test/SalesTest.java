package com.learning.Test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learning.DAO.ISalesDao;
import com.learning.Entities.Customer;
import com.learning.Entities.Sales;
import com.learning.Entities.User;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring.xml")
public class SalesTest {
	@Autowired
	private ISalesDao iSales;
	@Test
	public void salesTest(){
		Sales sales = iSales.getByID(1);
		System.out.println(sales.getSalesName());
		User user = sales.getUserInfo();
		System.out.println(user.getUserName());
		List<Customer> list = sales.getCustomers();
		System.out.println("customer info");
		System.out.println(list.get(0).getCustomerID());
		System.out.println(list.get(0).getCustomerName());
	}
}
