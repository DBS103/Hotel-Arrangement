package com.dbs.test;

import org.junit.Test;

import com.dbs.controller.Controllers;
import com.dbs.pojo.Customer;

public class CustomerTest {
	
	@Test
	public void test01() {
		
		Controllers c = new Controllers();
		c.findCustomerByid(2);
		
	}
	@Test
	public void test02() {
		Customer c = new Customer();
		c.setIdentity("111111111111111114");
		c.setPhone("11111111115");
		c.setSex("ÄÐ");
		c.setText("78");
		c.setUsername("luo");
		Controllers c2 = new Controllers();
		c2.addCustomer(c);
		
	}
	@Test
	public void test03() {
		
		Controllers c2 = new Controllers();
		c2.deleteCustomerByid(8);
	}
	
	@Test
	public void test04() {
		Customer c = new Customer();
		c.setId(9);
		c.setIdentity("221111111111111114");
		c.setPhone("11111111115");
		c.setSex("ÄÐ");
		c.setText("100");
		c.setUsername("luo");
		Controllers c2 = new Controllers();
		c2.updateCustomerByid(c);
	}
	@Test
	public void test05() {
		Controllers c2 = new Controllers();
		c2.selectCustomer();
	}

}
