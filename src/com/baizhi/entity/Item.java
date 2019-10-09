package com.baizhi.entity;

public class Item {
	private BookEntity book; //图书信息
	private Integer count; //书的数量
	private double totalMoney;  //原价的总金额
	private double saveMoney;  //当当价钱的总金额
	public BookEntity getBook() {
		return book;
	}
	public void setBook(BookEntity book) {
		this.book = book;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public double getSaveMoney() {
		return saveMoney;
	}
	public void setSaveMoney(double saveMoney) {
		this.saveMoney = saveMoney;
	}
	@Override
	public String toString() {
		return "Item [book=" + book + ", count=" + count + ", totalMoney="
				+ totalMoney + ", saveMoney=" + saveMoney + "]";
	}
	
}
