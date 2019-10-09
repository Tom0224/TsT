package com.baizhi.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.AddressDao;
import com.baizhi.entity.AddressEntity;
import com.baizhi.service.AddressService;
import com.baizhi.util.MybatisUtil;

public class AddressServiceImpl implements AddressService {

	@Override
	public List<AddressEntity> selectexist(Integer id) {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		List<AddressEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			AddressDao dao = sql.getMapper(AddressDao.class);	
			
			list = dao.selectexist(id);
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
	public void insertexist(AddressEntity add) {
		// TODO Auto-generated method stub
		SqlSession sql=null;
	
		try{
			sql = MybatisUtil.getSqlSession();
			AddressDao dao = sql.getMapper(AddressDao.class);	
			
			dao.insertexist(add);
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}
		

	}

	@Override
	public void updatedelete(Integer delete) {
		// TODO Auto-generated method stub
		SqlSession sql=null;
	
		try{
			sql = MybatisUtil.getSqlSession();
			AddressDao dao = sql.getMapper(AddressDao.class);	
			
		 dao.updatedelete(delete);
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}

	}

	@Override
	public void updateselected(Integer select) {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		
		try{
			sql = MybatisUtil.getSqlSession();
			AddressDao dao = sql.getMapper(AddressDao.class);	
			
		 dao.updateselected(select);
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}

	}

	@Override
	public void updateselectedall() {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		
		try{
			sql = MybatisUtil.getSqlSession();
			AddressDao dao = sql.getMapper(AddressDao.class);	
			
		 dao.updateselectedall();
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}

	}

}
