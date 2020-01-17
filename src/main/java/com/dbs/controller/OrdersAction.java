package com.dbs.controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import com.dbs.pojo.Orders;
import com.dbs.service.OrdersService;
import com.dbs.service.OrdersServiceImp;


@Controller

public class OrdersAction {
	

	private OrdersService ordersService= new OrdersServiceImp();

	@Test
	public void test() {
		
		
	}
	@Test
	public void testdelete() {
		
	}
	@Test
	public void testadd() {
		
	}


	





	

}
