package com.dbs.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.dbs.mapper.EmpMapper;
import com.dbs.pojo.Employee;
import com.dbs.service.EmpService;
import com.dbs.service.EmpServiceImpl;


@Controller
public class EmpController {
	
	private EmpService empSer = new EmpServiceImpl(); 
	
	@Test
	public void testOne() {
		System.out.println(this.empSer.findEmpByNo(1));
		
		
	}
	
	@Test
	public void testTwo() {
		Employee emp = new Employee();
		emp.setDeptno("2");
		emp.setEmpno(5);
		emp.setEname("zhangsan2");
		emp.setEpnum("1234567");
		emp.setEpswd("123456");
		emp.setEsex("男");
		this.empSer.addEmp(emp);
		System.out.println("ok");
		
	}
	
	@Test
	public void testThree() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpMapper empMapper= act.getBean(EmpMapper.class);
		Employee emp = new Employee();
		emp.setEmpno(1);
		emp.setDeptno("3");
		emp.setEname("gwh");
		emp.setEsex("男");
		emp.setEpswd("123456");
		emp.setEpnum("123456");
		empMapper.editEmp(emp);
		System.out.println("修改信息成功");
	}
	
	@Test
	public void testFour() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpMapper empMapper= act.getBean(EmpMapper.class);
		Employee emp = new Employee();
		emp.setEmpno(1);
		emp.setDeptno("3");
		emp.setEname("gwh");
		emp.setEsex("男");
		emp.setEpswd("123456");
		emp.setEpnum("123456");
		empMapper.editEmp(emp);
		System.out.println("修改信息成功");
	}
	

}
