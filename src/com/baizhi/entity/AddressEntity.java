package com.baizhi.entity;

import java.io.Serializable;

public class AddressEntity implements Serializable {
	private Integer id;
	private String receive_name;
	private String address;
	private String mobile;
	private Integer u_id;
	//删除标记
	private Integer delete_state;
	//默认地址
	private Integer selected_state;
	private UserEntity user;
	
	
	
	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AddressEntity(Integer id, String receive_name, String address,
			String mobile, Integer u_id, Integer delete_state,
			Integer selected_state, UserEntity user) {
		super();
		this.id = id;
		this.receive_name = receive_name;
		this.address = address;
		this.mobile = mobile;
		this.u_id = u_id;
		this.delete_state = delete_state;
		this.selected_state = selected_state;
		this.user = user;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getReceive_name() {
		return receive_name;
	}



	public void setReceive_name(String receive_name) {
		this.receive_name = receive_name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public Integer getU_id() {
		return u_id;
	}



	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}



	public Integer getDelete_state() {
		return delete_state;
	}



	public void setDelete_state(Integer delete_state) {
		this.delete_state = delete_state;
	}



	public Integer getSelected_state() {
		return selected_state;
	}



	public void setSelected_state(Integer selected_state) {
		this.selected_state = selected_state;
	}



	public UserEntity getUser() {
		return user;
	}



	public void setUser(UserEntity user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", receive_name=" + receive_name
				+ ", address=" + address + ", mobile=" + mobile + ", u_id="
				+ u_id + ", delete_state=" + delete_state + ", selected_state="
				+ selected_state + ", user=" + user + "]";
	}
	
	
	
	
	
}
