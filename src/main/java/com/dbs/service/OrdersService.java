package com.dbs.service;

import java.util.List;

import com.dbs.pojo.Orders;



public interface OrdersService {
	
	//处理退房信息
	public Orders selectByEntity(Orders orders);
	
	//收银信息管理
	public List<Orders> selectAll();
	
	//添加
	public boolean addOrders(Orders orders);
	
	//到更新页面钱，根据id查找要更新的信息
	public Orders selectById(int orderid);
	
	//修改
	public boolean updateOrders(Orders orders);
	
	//结算网费
	public boolean deleteOrdersById(Orders orders);

	
	

}
