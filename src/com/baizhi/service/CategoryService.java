package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.CategoryEntity;

public interface CategoryService {
	public List<CategoryEntity> selectall();
	//一级标签
	public List<CategoryEntity> selectcategorybook();
	//二级级标签
	//分组查询
	public List<CategoryEntity> selectCateAndCountByScid(Integer id);
	//二级表分组查询
	public List<CategoryEntity> selectCateAndCountBycid(Integer cid);

}
