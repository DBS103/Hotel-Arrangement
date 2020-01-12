package com.dbs.service;

import java.util.List;

import com.dbs.pojo.Orders;



public interface OrdersService {
	
	//�����˷���Ϣ
	public Orders selectByEntity(Orders orders);
	
	//������Ϣ����
	public List<Orders> selectAll();
	
	//���
	public boolean addOrders(Orders orders);
	
	//������ҳ��Ǯ������id����Ҫ���µ���Ϣ
	public Orders selectById(int orderid);
	
	//�޸�
	public boolean updateOrders(Orders orders);
	
	//��������
	public boolean deleteOrdersById(Orders orders);

	
	

}
