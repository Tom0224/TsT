package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.CategoryEntity;

public interface CategoryDao {
	//查询全部
		public List<CategoryEntity> selectall();
		//一对多查询类别
		public List<CategoryEntity> selectcategorybook();
		//分页查询
		
		//分组查询
		public List<CategoryEntity> selectCateAndCountByScid(Integer id);
		//二级表分组查询
		public List<CategoryEntity> selectCateAndCountBycid(Integer cid);
		
		
		

}
