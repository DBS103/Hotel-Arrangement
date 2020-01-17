package com.dbs.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dbs.pojo.Orders;
import com.dbs.pojo.Outhistory;

@Component
public interface OrdersMapper {
	
	public Orders selectByEntity(Orders order);
	
	public List<Orders> selectAll();
	public boolean addOrders(Orders order);
	public boolean deleteOrdersById(int orderid);
	public boolean addouthistory(Outhistory outhistory);
	public boolean updateroom(int roomid);
	public boolean updateroomtype(int roomid);
	

	
	
	

}
