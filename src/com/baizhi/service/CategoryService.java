package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.CategoryEntity;

public interface CategoryService {
	public List<CategoryEntity> selectall();
	//һ����ǩ
	public List<CategoryEntity> selectcategorybook();
	//��������ǩ
	//�����ѯ
	public List<CategoryEntity> selectCateAndCountByScid(Integer id);
	//����������ѯ
	public List<CategoryEntity> selectCateAndCountBycid(Integer cid);

}
