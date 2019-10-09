package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.OrderEntity;

public interface OrderService {
public List<OrderEntity> selectorder(Integer uid);
	
	public void  insertorder(OrderEntity add);

}
