package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.CategoryEntity;

public interface CategoryDao {
	//��ѯȫ��
		public List<CategoryEntity> selectall();
		//һ�Զ��ѯ���
		public List<CategoryEntity> selectcategorybook();
		//��ҳ��ѯ
		
		//�����ѯ
		public List<CategoryEntity> selectCateAndCountByScid(Integer id);
		//����������ѯ
		public List<CategoryEntity> selectCateAndCountBycid(Integer cid);
		
		
		

}
