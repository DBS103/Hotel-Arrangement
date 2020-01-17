package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


import com.dbs.mapper.EmpMapper;
import com.dbs.pojo.Employee;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpMapper empMapper;



	@Override
	public Employee findEmpByNo(int empno) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.empMapper= act.getBean(EmpMapper.class);
		Employee employee = empMapper.findEmpByNo(empno);
		return employee;
	}

	@Override
	public void addEmp(Employee emp) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.empMapper= act.getBean(EmpMapper.class);
		empMapper.addEmp(emp);
		
	}

	@Override
	public void editEmp(Employee emp) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.empMapper= act.getBean(EmpMapper.class);
		empMapper.editEmp(emp);;
		
		
	}

	@Override
	public void delEmp(int empno) {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.empMapper= act.getBean(EmpMapper.class);
		empMapper.delEmp(empno);
		
	}

	@Override
	public List<Employee> selectAll() {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.empMapper= act.getBean(EmpMapper.class);
		return empMapper.selectAll();
		
	}
	
	

}
