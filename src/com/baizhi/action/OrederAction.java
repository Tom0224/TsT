package com.baizhi.action;

import java.util.List;
import java.util.Map;

import com.baizhi.entity.AddressEntity;
import com.baizhi.entity.UserEntity;
import com.baizhi.service.AddressService;
import com.baizhi.service.impl.AddressServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OrederAction extends ActionSupport {
	
	private List<AddressEntity> list =null;
	public String selectid(){
		AddressService service = new AddressServiceImpl();
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity) session.get("user");
		if(user!=null){
			list= service.selectexist(user.getId());
			return "address_form";	
		}
		
		else{
			System.out.println("¾­¹ý");
			return "error";
		}

			
	}

}
