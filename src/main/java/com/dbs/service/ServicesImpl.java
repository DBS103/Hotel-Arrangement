package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.dbs.mapper.Mapper;
import com.dbs.pojo.Customer;
import com.dbs.pojo.Orders;
import com.dbs.pojo.Room;

public class ServicesImpl implements Services {
	
	@Autowired
	private Mapper mapper;
	
	@Override
	public boolean addCustomer(Customer customer) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.mapper = act.getBean(Mapper.class);
		boolean flag = mapper.addCustomer(customer);
		return flag;
		
	}

	@Override
	public Customer findCustomerByidService(int clientno) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.mapper = act.getBean(Mapper.class);
		Customer customer = mapper.findCustomerById(clientno);
		return customer;
	}
	public  static void main(String []args) {
		
	}

	@Override
	public int deleteCustomerByidService(Integer clientno) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.mapper = act.getBean(Mapper.class);
		return mapper.deleteCustomerByid(clientno);
		
	}

	@Override
	public int updateCustomerByidService(Customer customer) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.mapper = act.getBean(Mapper.class);
		return mapper.updateCustomerByid(customer);
	}

	@Override
	public List<Customer> selectCustomerService() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.mapper = act.getBean(Mapper.class);
		List<Customer> list = mapper.selectCustomer();
		return list;
		
	}

	@Override
	public List<Room> selectRoomTypeService() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.mapper = act.getBean(Mapper.class);
		List<Room> list = mapper.selectRoomType();
		return list;
	}

	@Override
	public boolean addOrders(Orders orders) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.mapper = act.getBean(Mapper.class);
		return mapper.addOrders(orders);
	}

	
}
