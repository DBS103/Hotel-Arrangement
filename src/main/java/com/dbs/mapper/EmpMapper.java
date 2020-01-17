package com.dbs.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dbs.pojo.Employee;


public interface EmpMapper {
	
	Employee findEmpByNo(int empno);
	
	void addEmp(Employee emp);
	
	void editEmp(Employee emp);
	
	void delEmp(int empno);
	
	List<Employee> selectAll();

}
