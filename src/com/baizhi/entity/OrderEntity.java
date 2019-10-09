package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderEntity implements Serializable {
	private Integer id;
	private String goodprice;
	private Date ordertime;
	private Integer orderstate;
	private Integer address_id;
	private Integer user_id;
	private List<OrderItemEntity> item;
	
	
	
	
	
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public OrderEntity(Integer id, String goodprice, Date ordertime,
			Integer orderstate, Integer address_id, Integer user_id,
			List<OrderItemEntity> item) {
		super();
		this.id = id;
		this.goodprice = goodprice;
		this.ordertime = ordertime;
		this.orderstate = orderstate;
		this.address_id = address_id;
		this.user_id = user_id;
		this.item = item;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodprice() {
		return goodprice;
	}
	public void setGoodprice(String goodprice) {
		this.goodprice = goodprice;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Integer getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(Integer orderstate) {
		this.orderstate = orderstate;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public List<OrderItemEntity> getItem() {
		return item;
	}
	public void setItem(List<OrderItemEntity> item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", goodprice=" + goodprice
				+ ", ordertime=" + ordertime + ", orderstate=" + orderstate
				+ ", address_id=" + address_id + ", user_id=" + user_id
				+ ", item=" + item + "]";
	}
	
}
