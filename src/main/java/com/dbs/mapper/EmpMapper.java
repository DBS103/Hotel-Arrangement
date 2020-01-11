package com.dbs.mapper;

import com.dbs.pojo.Employee;

public interface EmpMapper {
	
	Employee findEmpByNo(int empno);
	
	void addEmp(Employee emp);
	
	void editEmp(Employee emp);
	
	void delEmp(int empno);

}
