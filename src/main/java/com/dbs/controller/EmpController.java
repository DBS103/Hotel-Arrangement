package com.dbs.controller;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbs.mapper.EmpMapper;
import com.dbs.pojo.Employee;
import com.dbs.service.EmpService;
import com.dbs.service.EmpServiceImpl;


@Controller
public class EmpController {
	
	
	private EmpService empSer = new EmpServiceImpl(); 
	
	@RequestMapping(value= {"/employee/**"})
	public String employee() {
		return "EmpManage";
	}
	
	public Employee findEmpByNo(int empno) {
		return this.empSer.findEmpByNo(empno);
	
	}
	
	
	public void addEmp(Employee emp) {
		
		this.empSer.addEmp(emp);
		
		System.out.println("ok");
		
		
	}
	

	
	public void editEmp(Employee emp) {
		
		this.empSer.editEmp(emp);
		System.out.println("修改信息成功");
	}
	

	public void delEmp(int empno) {
		this.empSer.delEmp(empno);
		System.out.println("删除信息成功");

	}
	

}
