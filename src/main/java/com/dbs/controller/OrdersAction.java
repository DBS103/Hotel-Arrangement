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
	
	@Autowired
	private OrdersService ordersService;

	@Test
	public void test() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		ordersService= act.getBean(OrdersService.class);
		Orders orders = new Orders();
		orders.setOrderid("1");
		Orders order = ordersService.selectByEntity(orders);
		System.out.println(order);
		
	}
	@Test
	public void testdelete() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		ordersService= act.getBean(OrdersService.class);
		Orders orders = new Orders();
		orders.setOrderid("1");
		Orders order=ordersService.selectByEntity(orders);
		boolean flag = ordersService.deleteOrdersById(order);
		System.out.println(flag);
	}
	@Test
	public void testadd() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		ordersService= act.getBean(OrdersService.class);
		Orders orders = new Orders();
		orders.setOrderid("2");
		orders.setEmpno(2);
		orders.setOcash(200);
		orders.setOtext("第二间房");
		orders.setRoomid(2);
		orders.setClientno("2");
		boolean flag = ordersService.addOrders(orders);
		System.out.println(flag);
	}


	





	

}
