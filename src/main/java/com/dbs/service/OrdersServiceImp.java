package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

=======
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.dbs.mapper.Mapper;
>>>>>>> branch 'master' of https://github.com/DBS103/Hotel-Arrangement.git
import com.dbs.mapper.OrdersMapper;
import com.dbs.pojo.Orders;
import com.dbs.pojo.Outhistory;
import com.dbs.service.OrdersService;
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/DBS103/Hotel-Arrangement.git
@Service
public class OrdersServiceImp implements OrdersService {

	@Autowired
	private OrdersMapper omapper;
	
	


	@Override
	public Orders selectByEntity(Orders order) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.omapper = act.getBean(OrdersMapper.class);
		Orders ord  = omapper.selectByEntity(order);
		return ord;
	}

	@Override
	public List<Orders> selectAll() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.omapper = act.getBean(OrdersMapper.class);
		List<Orders> orderList = omapper.selectAll();
		return orderList;
	}

	@Override
	public boolean addOrders(Orders order) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.omapper = act.getBean(OrdersMapper.class);
		boolean flag = omapper.addOrders(order);
		return flag;
	}

	@Override
	public Orders selectById(int orderId) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.omapper = act.getBean(OrdersMapper.class);
		Orders order =new Orders();
		return order;
	}

	@Override
	public boolean updateOrders(Orders order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrdersById(Orders orders) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.omapper = act.getBean(OrdersMapper.class);
		boolean flag1=omapper.deleteOrdersById(Integer.parseInt(orders.getOrderid()));
		Outhistory outhistory=new Outhistory();
		System.out.println(orders.getClientno().trim());
		outhistory.setClientno(Integer.parseInt(orders.getClientno().trim()));
		outhistory.setRoomid(orders.getRoomid());
		outhistory.setEmpno(orders.getEmpno());
		outhistory.setCotext(orders.getOtext());
		boolean flag2=omapper.addouthistory(outhistory);
		boolean flag3=omapper.updateroom(orders.getRoomid());
		boolean flag4=omapper.updateroomtype(orders.getRoomid());
		boolean flag=flag1&&flag2&&flag3&&flag4;
		return flag;
	}









}
