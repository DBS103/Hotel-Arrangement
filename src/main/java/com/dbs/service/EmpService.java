package com.dbs.service;

import java.util.List;

import com.dbs.pojo.Employee;

public interface EmpService {
	//ͨ��empno����Ա��
	Employee findEmpByNo(int empno) ;
	//�����Ա��
	void addEmp(Employee emp);
	//�޸�Ա����Ϣ	
	void editEmp(Employee emp);
	//ɾ��Ա��
	void delEmp(int empno);
	//��ѯȫ��Ա��
	List<Employee> selectAll();
	
	

}
