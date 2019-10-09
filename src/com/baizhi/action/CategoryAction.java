package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.CategoryEntity;
import com.baizhi.service.CategoryService;
import com.baizhi.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport {
	private List<CategoryEntity> list;
	
	
	
	public String selectall(){
		CategoryService service = new CategoryServiceImpl();
		list = service.selectall();
		return "category";
		
	}
	
	
	
	
	

	public List<CategoryEntity> getList() {
		return list;
	}

	public void setList(List<CategoryEntity> list) {
		this.list = list;
	}
	
	

}
