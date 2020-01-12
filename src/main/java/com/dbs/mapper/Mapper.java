package com.dbs.mapper;

import java.util.List;

import com.dbs.pojo.Customer;
import com.dbs.pojo.Orders;
import com.dbs.pojo.Room;

public interface Mapper {
	
	//��ѯCustomer(id)
	Customer findCustomerById(Integer clientno);
	//��ѯCustomer
	List<Customer> selectCustomer();
	//���Customer
	boolean addCustomer(Customer customer);
	//ɾ��Customer
	int deleteCustomerByid(Integer clientno);
	//�޸�Customer
	int updateCustomerByid(Customer customer);
	
	//��ѯ���з���״̬
	List<Room> selectRoomType();
	
	//��������
	boolean addOrders(Orders orders);
	
	
	
	
	

}
