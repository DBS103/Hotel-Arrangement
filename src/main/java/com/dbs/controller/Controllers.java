package com.dbs.controller;



import java.util.List;

import com.dbs.pojo.Customer;
import com.dbs.pojo.Room;
import com.dbs.service.Services;
import com.dbs.service.ServicesImpl;

public class Controllers {
	
	private Services customerservice= new ServicesImpl();
	
	
	public void findCustomerByid(Integer clientno) {
		Customer customer = this.customerservice.findCustomerByidService(clientno);
		System.out.println(customer);
	}
	
	
	public void addCustomer(Customer customer) {
		if(this.customerservice.addCustomer(customer)) {
			System.out.println("插入成功");
		}else {
			System.out.println("插入失败");
		}
	}
	
	public void deleteCustomerByid(Integer clientno) {
		int num = this.customerservice.deleteCustomerByidService(clientno);
		if(num>0) {
			System.out.println("删suc");
		}else {
			System.out.println("未failed");
		}
	}
	public void updateCustomerByid(Customer customer) {
		int num = this.customerservice.updateCustomerByidService(customer);
		if(num>0) {
			System.out.println("改suc");
		}else {
			System.out.println("未failed");
		}
	}
	public void selectCustomer() {
		List<Customer> list = this.customerservice.selectCustomerService();
		System.out.println(list);
	}
	
	public void selectRoom() {
		List<Room> list = this.customerservice.selectRoomTypeService();
		System.out.println(list);
	}
	

}
