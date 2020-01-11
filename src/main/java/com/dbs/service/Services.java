package com.dbs.service;

import java.util.List;

import com.dbs.pojo.Customer;
import com.dbs.pojo.Orders;
import com.dbs.pojo.Room;

public interface Services {
	
	boolean addCustomer(Customer customer);
	Customer findCustomerByidService(int clientno);
	int deleteCustomerByidService(Integer clientno);
	int updateCustomerByidService(Customer customer);
	List<Customer> selectCustomerService();
	
	List<Room> selectRoomTypeService();
	
	boolean addOrders(Orders orders);
	

}
