package com.dbs.controller;



import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.dbs.pojo.Customer;
import com.dbs.pojo.Room;
import com.dbs.service.Services;
import com.dbs.service.ServicesImpl;





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
	
	
	
	public void findCustomerByid(Integer clientno) {
		Customer customer = this.customerservice.findCustomerByidService(clientno);
		System.out.println(customer);
	}
	
	@RequestMapping("/addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		if(this.customerservice.addCustomer(customer)) {
			System.out.println("插入成功");
		}else {
			System.out.println("插入失败");
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
			System.out.println("改suc");
		}else {
			System.out.println("未failed");
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
