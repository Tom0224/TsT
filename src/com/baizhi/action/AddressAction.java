package com.baizhi.action;

import java.util.List;
import java.util.Map;

import com.baizhi.entity.AddressEntity;
import com.baizhi.entity.UserEntity;
import com.baizhi.service.AddressService;
import com.baizhi.service.impl.AddressServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddressAction extends ActionSupport {
	private List<AddressEntity> list =null;
	private Integer select;
	private Integer delete;
	private AddressEntity add;
	
	

	
	
	public String insertexist(){
		System.out.println(add+"===========================");
		AddressService service = new AddressServiceImpl();
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity) session.get("user");
		System.out.println(user.getId()+"aaaaaaaaaa");
		Integer u_id = user.getId();
		add.setU_id(u_id);
		System.out.println(add+"-----------");
		service.insertexist(add);
		return "selectexist";
	}
	
	
	public String selectexist(){
		AddressService service = new AddressServiceImpl();
		Map<String, Object> session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity) session.get("user");
		if(user!=null){
			list= service.selectexist(user.getId());
			return "my_address";	
		}
		else{
			System.out.println("¾­¹ý");
			return "error";
		}

			
	}
	public String updatedelete(){
		AddressService service = new AddressServiceImpl();
		service.updatedelete(delete);
		
		return "selectexist";
		
	}
	
	public String updateselected(){
		AddressService service = new AddressServiceImpl();
		service.updateselectedall();
		System.out.println(select+"action update");
		service.updateselected(select);
		
		return "selectexist";
		
	}
	
	public List<AddressEntity> getList() {
		return list;
	}
	public void setList(List<AddressEntity> list) {
		this.list = list;
	}

	public AddressEntity getAdd() {
		return add;
	}


	public void setAdd(AddressEntity add) {
		this.add = add;
	}


	public Integer getSelect() {
		return select;
	}

	public void setSelect(Integer select) {
		this.select = select;
	}
	public Integer getDelete() {
		return delete;
	}
	public void setDelete(Integer delete) {
		this.delete = delete;
	}

	

}
