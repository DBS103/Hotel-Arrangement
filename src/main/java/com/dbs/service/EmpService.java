package com.dbs.service;

import com.dbs.pojo.Employee;

public interface EmpService {
	
	Employee findEmpByNo(int empno) ;
	
	void addEmp(Employee emp);
	
	void editEmp(Employee emp);
	
	void delEmp(int empno);
	
	

}
