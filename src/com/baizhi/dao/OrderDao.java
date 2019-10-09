package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.AddressEntity;
import com.baizhi.entity.OrderEntity;

public interface OrderDao {
	//查询全部
	public List<OrderEntity> selectorder(Integer uid);
	//添加数据
	public void  insertorder(OrderEntity add);
	/*
	//设置隐藏
	public void  updatedelete(Integer delete);
	//默认地址
	public void  updateselected(Integer select);
	public void updateselectedall();
*/
}
