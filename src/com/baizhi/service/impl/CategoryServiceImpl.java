package com.baizhi.service.impl;

import java.util.List;
import java.util.Locale.Category;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.CategoryEntity;
import com.baizhi.service.CategoryService;
import com.baizhi.util.MybatisUtil;

public class CategoryServiceImpl implements CategoryService {
	//二级表分组查询
	public List<CategoryEntity> selectCateAndCountBycid(Integer cid){
		
		SqlSession sql =null;
		List<CategoryEntity> list = null;
		
		try{
			sql = MybatisUtil.getSqlSession();
			CategoryDao dao = sql.getMapper(CategoryDao.class);
		    list = dao.selectCateAndCountBycid(cid);
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}
		
		
		return list;
		
	}
	
	
	
	
	
	public List<CategoryEntity> selectCateAndCountByScid(Integer id){
		SqlSession sql =null;
		List<CategoryEntity> list = null;
		
		try{
			sql = MybatisUtil.getSqlSession();
			CategoryDao dao = sql.getMapper(CategoryDao.class);
		    list = dao.selectCateAndCountByScid(id);
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}
		
		
		
		return list;
		
	}

	@Override
	public List<CategoryEntity> selectall() {
		// TODO Auto-generated method stub
		SqlSession sql =null;
		List<CategoryEntity> list = null;
		
		try{
			sql = MybatisUtil.getSqlSession();
			CategoryDao dao = sql.getMapper(CategoryDao.class);
		    list = dao.selectall();
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}
		
		
		
		return list;
	}

	public List<CategoryEntity> selectcategorybook(){
		return null;
		
	}

	

}
