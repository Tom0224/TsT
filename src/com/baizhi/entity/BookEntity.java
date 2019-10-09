package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BookEntity implements Serializable {
	private Integer book_id;
	private Integer cid;
	private String book_name;
	private Double book_prive;
	private Date groundingDate;
							
	private String inventoty;
	
	private  String author;
	private  Integer salenum;
	private String messages;
	private Double Dangproce;
					
	private String product_image;
	private CategoryEntity CategoryEntity;
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookEntity(Integer book_id, Integer cid, String book_name,
			Double book_prive, Date groundingDate, String inventoty,
			String author, Integer salenum, String messages, Double dangproce,
			String product_image,
			com.baizhi.entity.CategoryEntity categoryEntity) {
		super();
		this.book_id = book_id;
		this.cid = cid;
		this.book_name = book_name;
		this.book_prive = book_prive;
		this.groundingDate = groundingDate;
		this.inventoty = inventoty;
		this.author = author;
		this.salenum = salenum;
		this.messages = messages;
		Dangproce = dangproce;
		this.product_image = product_image;
		CategoryEntity = categoryEntity;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Double getBook_prive() {
		return book_prive;
	}
	public void setBook_prive(Double book_prive) {
		this.book_prive = book_prive;
	}
	public Date getGroundingDate() {
		return groundingDate;
	}
	public void setGroundingDate(Date groundingDate) {
		this.groundingDate = groundingDate;
	}
	public String getInventoty() {
		return inventoty;
	}
	public void setInventoty(String inventoty) {
		this.inventoty = inventoty;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getSalenum() {
		return salenum;
	}
	public void setSalenum(Integer salenum) {
		this.salenum = salenum;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	public Double getDangproce() {
		return Dangproce;
	}
	public void setDangproce(Double dangproce) {
		Dangproce = dangproce;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public CategoryEntity getCategoryEntity() {
		return CategoryEntity;
	}
	public void setCategoryEntity(CategoryEntity categoryEntity) {
		CategoryEntity = categoryEntity;
	}
	@Override
	public String toString() {
		return "BookEntity [book_id=" + book_id + ", cid=" + cid
				+ ", book_name=" + book_name + ", book_prive=" + book_prive
				+ ", groundingDate=" + groundingDate + ", inventoty="
				+ inventoty + ", author=" + author + ", salenum=" + salenum
				+ ", messages=" + messages + ", Dangproce=" + Dangproce
				+ ", product_image=" + product_image + ", CategoryEntity="
				+ CategoryEntity + "]";
	}
	
}
