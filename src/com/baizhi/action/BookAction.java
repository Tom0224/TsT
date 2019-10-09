package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.BookEntity;
import com.baizhi.entity.CategoryEntity;
import com.baizhi.service.BookService;
import com.baizhi.service.CategoryService;
import com.baizhi.service.impl.BookServiceimpl;
import com.baizhi.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	
	
	
	private List<BookEntity> list;
	private BookEntity listbook;
	private Integer id;
	private Integer pa=1;
	private Integer ov=5;
	private Integer sum;
	private Integer start =1;
	private Integer end =5;
	private Integer cid;
	private List<CategoryEntity> listcate;
	
	public List<CategoryEntity> getListcate() {
		return listcate;
	}



	public void setListcate(List<CategoryEntity> listcate) {
		this.listcate = listcate;
	}



	public String selectByStartEndAndScid(){
		BookService service =  new  BookServiceimpl();
		
		sum = service.selectCountByScid(end, cid);
		list = service.selectByStartEndAndScid(pa, end, cid);
		System.out.println("---"+cid+"-------"+list+"---");
		
		
		CategoryService cate= new CategoryServiceImpl();
		
		listcate=cate.selectCateAndCountBycid(cid);
		System.out.println(listcate);
//		System.out.println(cid+"==============");
//		System.out.println(list+"---------");
//		System.out.println(sum+"-==-=-=-=-=-=--=");
		return "book_list";
		
	}
	


	public String selectpaging(){
		BookService service =  new  BookServiceimpl();
		
		CategoryService cate= new CategoryServiceImpl();
		
		listcate=cate.selectCateAndCountByScid(id);
		System.out.println(listcate);
		list = service.selectpaging(pa,ov,id);
		sum=service.selectsum(ov,id);
		
		return "book_list";
		
	}
	
	
	public String selectBookEntityId(){
		BookService service =  new  BookServiceimpl();
		listbook = service.selectBookEntityId(id);
		
		return "product";
		
	}
	

	
	//热卖狂			selectbooksalenum
	public String selectbooksalenum(){
		BookService service =  new  BookServiceimpl();
		list = service.selectbooksalenum();
		return "hotBoard";
		
	}
	
	
	
	//最新框
	public String selectdate(){
		BookService service =  new  BookServiceimpl();
		list = service.selectdate();
		return "new";
		
	}
	
	//推荐框
	public String selectsalenumdes(){
		BookService service =  new  BookServiceimpl();
		list = service.selectsalenumdes();
		
		return "tolist";
	}
	public String selectsalenum(){
		BookService service =  new  BookServiceimpl();
		list = service.selectsalenum();
		
		return "hot";
	}
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public List<BookEntity> getList() {
		return list;
	}

	public void setList(List<BookEntity> list) {
		this.list = list;
	}



	public BookEntity getListbook() {
		return listbook;
	}



	public void setListbook(BookEntity listbook) {
		this.listbook = listbook;
	}


	public Integer getPa() {
		return pa;
	}


	public void setPa(Integer pa) {
		this.pa = pa;
	}


	public Integer getOv() {
		return ov;
	}


	public void setOv(Integer ov) {
		this.ov = ov;
	}


	public Integer getSum() {
		return sum;
	}


	public void setSum(Integer sum) {
		this.sum = sum;
	}



	public Integer getStart() {
		return start;
	}



	public void setStart(Integer start) {
		this.start = start;
	}



	public Integer getEnd() {
		return end;
	}



	public void setEnd(Integer end) {
		this.end = end;
	}



	public Integer getCid() {
		return cid;
	}



	public void setCid(Integer cid) {
		this.cid = cid;
	}




}
