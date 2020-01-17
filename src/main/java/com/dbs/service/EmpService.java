package com.dbs.service;

import java.util.List;

import com.dbs.pojo.Employee;

public interface EmpService {
	//通过empno查找员工
	Employee findEmpByNo(int empno) ;
	//添加新员工
	void addEmp(Employee emp);
	//修改员工信息	
	void editEmp(Employee emp);
	//删除员工
	void delEmp(int empno);
	//查询全部员工
	List<Employee> selectAll();
	
	

}
