package com.dbs.mapper;

import java.util.List;

import com.dbs.pojo.Orders;
import com.dbs.pojo.Outhistory;


public interface OrdersMapper {
	
	public Orders selectByEntity(Orders orers);
	
	public List<Orders> selectAll();
	
	public boolean deleteOrdersById(int orderid);
	public boolean addouthistory(Outhistory outhistory);
	public boolean updateroom(int roomid);
	public boolean updateroomtype(int roomid);
	

	
	
	

}
