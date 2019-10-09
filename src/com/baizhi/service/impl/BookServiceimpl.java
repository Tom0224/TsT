package com.baizhi.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;







import com.baizhi.dao.BookDao;
import com.baizhi.entity.BookEntity;
import com.baizhi.service.BookService;
import com.baizhi.util.MybatisUtil;

public class BookServiceimpl implements BookService {
	public BookEntity selectbookid(Integer book_id){
		SqlSession sql=null;
		BookEntity book = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);	
			
			book = dao.selectbookid(book_id);
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}
		
		return book;
		
	}
	
	//二级表
	public List<BookEntity> selectByStartEndAndScid(Integer start,Integer end,Integer cid){
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);	
			int page=(start-1)*end+1;
			int over=start*end;
			list = dao.selectByStartEndAndScid(start, end, cid);
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
	
	public Integer selectCountByScid(Integer end,Integer cid){
		SqlSession sql=null;
		Integer sum = 0;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
			
		    sum = dao.selectCountByScid(cid);
		   
		    
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}
		
		return sum%end==0?sum/end:sum/end+1;
	}
	
	
	
	

	//分页查询  一级表
	public  List<BookEntity> selectpaging(Integer pa,Integer ov,Integer id){
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
			int page=(pa-1)*ov+1;
			int over=pa*ov;
		    list = dao.selectpaging(page,over,id);
		    
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
	//查询总条数
	public Integer selectsum(Integer over,Integer parent_id){
		
		
		SqlSession sql=null;
		Integer sum = 0;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    sum = dao.selectsum(parent_id);
		    
		    
			sql.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			sql.rollback();
		}
		finally{
			MybatisUtil.colseSqlSession(sql);
		}
		return sum%over==0?sum/over:sum/over+1;
		
	}

	
	
	
	
	public BookEntity selectBookEntityId(Integer id){
		SqlSession sql=null;
		BookEntity list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    list = dao.selectBookEntityId(id);
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
	
	
	
	public List<BookEntity> selectbooksalenum(){
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    list = dao.selectbooksalenum();
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
	public List<BookEntity> selectbookall() {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    list = dao.selectbookall();
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
	public List<BookEntity> selectsalenumdes() {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    list = dao.selectsalenumdes();
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
	public List<BookEntity> selectsalenum() {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    list = dao.selectsalenum();
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
	public List<BookEntity> selectdate() {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    list = dao.selectdate();
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
	public List<BookEntity> selectdatedes() {
		// TODO Auto-generated method stub
		SqlSession sql=null;
		List<BookEntity> list = null;
		try{
			sql = MybatisUtil.getSqlSession();
			BookDao dao = sql.getMapper(BookDao.class);
		    list = dao.selectdatedes();
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

}
