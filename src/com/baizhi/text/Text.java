package com.baizhi.text;

import java.util.List;

import com.baizhi.entity.OrderEntity;
import com.baizhi.service.OrderService;
import com.baizhi.service.impl.OrderServiceImpl;

public class Text {
	public static void main(String[] args) {
		OrderService serivice = new OrderServiceImpl();
		 List<OrderEntity> selectorder = serivice.selectorder(1);
		System.out.println(selectorder);
		
		
//		BookService service =  new  BookServiceimpl();
	/*	CategoryService dao= new CategoryServiceImpl();
		List<CategoryEntity> list = dao.selectCateAndCountByScid(1);
		System.out.println(list);*/
	//	List<BookEntity>date = service.selectpaging(1, 5, 1);
	//	List<BookEntity>date = service.selectbooksalenum();
	//	Integer date = service.selectsum(5, 1);
		//List<BookEntity>date=service.selectByStartEndAndScid(1,5,9);
		//Integer date=service.selectCountByFcid(1);
	//	System.out.println(date);
		
		
		/*BookService service =  new  BookServiceimpl();
	
		BookEntity book = service.selectbookid(1);
		System.out.println(book);*/
		
	}

}
