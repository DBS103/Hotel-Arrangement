package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.mapper.OrdersMapper;
import com.dbs.pojo.Orders;
import com.dbs.pojo.Outhistory;
import com.dbs.service.OrdersService;

@Service
public class OrdersServiceImp implements OrdersService {

	@Autowired
	private OrdersMapper omapper;
	
	


	@Override
	public Orders selectByEntity(Orders order) {
		Orders orders = this.omapper.selectByEntity(order);
		return orders;
	}

	@Override
	public List<Orders> selectAll() {
		List<Orders> orderList = omapper.selectAll();
		return orderList;
	}

	@Override
	public boolean addOrders(Orders order) {

		return false;
	}

	@Override
	public Orders selectById(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrders(Orders order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrdersById(Orders orders) {
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
