package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.AddressEntity;
import com.baizhi.entity.OrderEntity;

public interface OrderDao {
	//��ѯȫ��
	public List<OrderEntity> selectorder(Integer uid);
	//�������
	public void  insertorder(OrderEntity add);
	/*
	//��������
	public void  updatedelete(Integer delete);
	//Ĭ�ϵ�ַ
	public void  updateselected(Integer select);
	public void updateselectedall();
*/
}
