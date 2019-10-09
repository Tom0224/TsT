package com.baizhi.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.OrderDao;
import com.baizhi.dao.UserDao;
import com.baizhi.entity.OrderEntity;
import com.baizhi.entity.UserEntity;
import com.baizhi.service.OrderService;
import com.baizhi.util.MybatisUtil;

public class OrderServiceImpl implements OrderService {

	@Override
	public List<OrderEntity> selectorder(Integer uid) {
		// TODO Auto-generated method stub
		SqlSession sql= null;
		List<OrderEntity> list=null;
		try{
			sql = MybatisUtil.getSqlSession();
			OrderDao dao = sql.getMapper(OrderDao.class);
		   list = dao.selectorder(uid);
			sql.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		return list;
	}

	@Override
	public void insertorder(OrderEntity add) {
		// TODO Auto-generated method stub
		SqlSession sql = null;
		try{
			sql = MybatisUtil.getSqlSession();
			OrderDao dao = sql.getMapper(OrderDao.class);
		     dao.insertorder(add);
			sql.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}

	}

}
