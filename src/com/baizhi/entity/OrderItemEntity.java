package com.baizhi.entity;

import java.io.Serializable;

public class OrderItemEntity implements Serializable {
	private Integer id;
	private Integer product_id;
	private Integer order_id;
	private Integer count ;
	private Integer amount;
	private Integer saveMoney;
	
	private OrderEntity order;

	
	
	
	
	
	public OrderItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItemEntity(Integer id, Integer product_id, Integer order_id,
			Integer count, Integer amount, Integer saveMoney, OrderEntity order) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.order_id = order_id;
		this.count = count;
		this.amount = amount;
		this.saveMoney = saveMoney;
		this.order = order;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getSaveMoney() {
		return saveMoney;
	}

	public void setSaveMoney(Integer saveMoney) {
		this.saveMoney = saveMoney;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ItemEntity [id=" + id + ", product_id=" + product_id
				+ ", order_id=" + order_id + ", count=" + count + ", amount="
				+ amount + ", saveMoney=" + saveMoney + ", order=" + order
				+ "]";
	}

	
}
