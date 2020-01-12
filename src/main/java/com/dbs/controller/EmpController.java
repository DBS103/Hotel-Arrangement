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
	
<<<<<<< HEAD
	@Test
	public void testOne() {
		System.out.println(this.empSer.findEmpByNo(5));
=======

	public Employee findEmpByNo(int empno) {
		return this.empSer.findEmpByNo(empno);
>>>>>>> 7b66eef38d3981a7469322f3a33392caafc0285f
		
		
	}
	
	
	public void addEmp(Employee emp) {
		
		this.empSer.addEmp(emp);
		
		System.out.println("ok");
		
		
	}
	
<<<<<<< HEAD
	@Test
	public void testThree() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpMapper empMapper= act.getBean(EmpMapper.class);
		Employee emp = new Employee();
		emp.setEmpno(5);
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
		emp.setEmpno(5);
		emp.setDeptno("3");
		emp.setEname("gwh");
		emp.setEsex("男");
		emp.setEpswd("123456");
		emp.setEpnum("123456");
		empMapper.editEmp(emp);
		System.out.println("修改信息成功");
=======
	
	public void editEmp(Employee emp) {
		
		this.empSer.editEmp(emp);
		System.out.println("修改信息成功");
	}
	

	public void delEmp(int empno) {
		this.empSer.delEmp(empno);
		System.out.println("删除信息成功");
>>>>>>> 7b66eef38d3981a7469322f3a33392caafc0285f
	}
	

}
