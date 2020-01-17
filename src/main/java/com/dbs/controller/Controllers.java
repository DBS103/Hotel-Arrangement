package com.dbs.controller;



import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
=======

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

>>>>>>> branch 'master' of https://github.com/DBS103/Hotel-Arrangement.git

import com.dbs.pojo.Customer;
import com.dbs.pojo.Room;

import com.dbs.service.Services;
import com.dbs.service.ServicesImpl;

<<<<<<< HEAD
=======




>>>>>>> branch 'master' of https://github.com/DBS103/Hotel-Arrangement.git
@Controller
public class Controllers {
	
	private Services customerservice= new ServicesImpl();
	@RequestMapping(value= {"/home/**"})
	public String home() {
		return "home";
	}
	
	@RequestMapping(value= {"/customer/**"})
	public String customer() {
		return "customerList";
	}
	
	
	@RequestMapping(value= {"/customer/**"})
	public String customer() {
		return "customerList";
	}
	@RequestMapping(value="/customersel/**")
	@ResponseBody
	public List<Customer> customersel() {
		List<Customer> list = this.customerservice.selectCustomerService();
		return list;
	}
	public void findCustomerByid(Integer clientno) {
		Customer customer = this.customerservice.findCustomerByidService(clientno);
		System.out.println(customer);
	}
	
	@RequestMapping("/addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		if(this.customerservice.addCustomer(customer)) {
			System.out.println("����ɹ�");
		}else {
			System.out.println("����ʧ��");
		}
	}
	
	@RequestMapping("/delCustomer")
	public Customer deleteCustomerByid(@RequestBody Customer no) {
		Integer clientno = no.getClientno();
		int num = this.customerservice.deleteCustomerByidService(clientno);
		if(num>0) {
			System.out.println("success");
		}else {
			System.out.println("failed");	
		}
		return no;
	}
	
	@RequestMapping("/updCustomer")
	public void updateCustomerByid(@RequestBody Customer customer) {
		int num = this.customerservice.updateCustomerByidService(customer);
		if(num>0) {
			System.out.println("suc");
		}else {
			System.out.println("failed");
		}
	}
	
	@RequestMapping(value= {"/selCustomer"},method=RequestMethod.GET)
	@ResponseBody
	public List selectCustomer() {
		List<Customer> list = this.customerservice.selectCustomerService();
		return list;
	}
	
	public void selectRoom() {
		List<Room> list = this.customerservice.selectRoomTypeService();
		System.out.println(list);
	}
	
	
	

}
