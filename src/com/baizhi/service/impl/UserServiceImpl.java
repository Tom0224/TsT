package com.baizhi.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.CategoryDao;
import com.baizhi.dao.UserDao;
import com.baizhi.entity.UserEntity;
import com.baizhi.service.UserService;
import com.baizhi.util.MybatisUtil;

public class UserServiceImpl implements UserService {

	@Override
	public UserEntity selectexist(String email,String passwoerd) {
		// TODO Auto-generated method stub
		SqlSession sql= null;
		UserEntity list=null;
		try{
			sql = MybatisUtil.getSqlSession();
			UserDao dao = sql.getMapper(UserDao.class);
		   list = dao.selectexist(email,passwoerd);
			sql.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		
		return list;
	}

	@Override
	public void interUser(UserEntity user) {
		// TODO Auto-generated method stub
		SqlSession sql = null;
		try{
			sql = MybatisUtil.getSqlSession();
			UserDao dao = sql.getMapper(UserDao.class);
		     dao.interUser(user);
			sql.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}

	}

}
