package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.AddressEntity;

public interface AddressService {

	//查询
	public List<AddressEntity> selectexist(Integer id);
	public void  insertexist(AddressEntity add);
	//设置隐藏
	public void  updatedelete(Integer delete);
	//默认地址
	public void  updateselected(Integer select);
	public void updateselectedall();

}
