package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.AddressEntity;

public interface AddressService {

	//��ѯ
	public List<AddressEntity> selectexist(Integer id);
	public void  insertexist(AddressEntity add);
	//��������
	public void  updatedelete(Integer delete);
	//Ĭ�ϵ�ַ
	public void  updateselected(Integer select);
	public void updateselectedall();

}
