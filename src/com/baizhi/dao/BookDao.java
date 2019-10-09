package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.BookEntity;
import com.baizhi.entity.CategoryEntity;

public interface BookDao{
	//查询全部
	public List<BookEntity> selectbookall();
	//通过id 查询
		public BookEntity selectbookid(Integer book_id);
	
	//查询	销量最少  推荐框
	public List<BookEntity> selectsalenumdes();
	//查询	销量最前8本  热销框
	public List<BookEntity> selectsalenum();
	//查询     时间最后的 	最新框  
	public List<BookEntity> selectdate();
	//查询     时间最后的 销量倒序	最新框  
	public List<BookEntity> selectdatedes();
	//查询	销量最多  热卖框
	public List<BookEntity> selectbooksalenum();
	//通过id多对一查询
	public BookEntity selectBookEntityId(Integer id);
	
	
	//分页查询一级表
	public  List<BookEntity> selectpaging(@Param("page")Integer page,@Param("over")Integer over,@Param("id")Integer id);
	//查询总条数
	public Integer selectsum(Integer parent_id);
	
	//二级表
	public List<BookEntity> selectByStartEndAndScid(@Param("s")Integer start,@Param("e")Integer end,@Param("cid")Integer cid);
	


	
	/**
	 * 根据二级类别编号查询该类别下面有多少本书
	 * @param scid 二级类别编号
	 * @return 图书的条数
	 */
	public Integer selectCountByScid(Integer cid);

}
