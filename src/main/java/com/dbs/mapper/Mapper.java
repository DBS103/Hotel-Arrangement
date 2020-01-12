package com.dbs.mapper;

import java.util.List;

import com.dbs.pojo.Customer;
import com.dbs.pojo.Orders;
import com.dbs.pojo.Room;

public interface Mapper {
	
	//查询Customer(id)
	Customer findCustomerById(Integer clientno);
	//查询Customer
	List<Customer> selectCustomer();
	//添加Customer
	boolean addCustomer(Customer customer);
	//删除Customer
	int deleteCustomerByid(Integer clientno);
	//修改Customer
	int updateCustomerByid(Customer customer);
	
	//查询所有房间状态
	List<Room> selectRoomType();
	
	//创建订单
	boolean addOrders(Orders orders);
	
	
	
	
	

}
