package com.baizhi.entity;

public class Item {
	private BookEntity book; //ͼ����Ϣ
	private Integer count; //�������
	private double totalMoney;  //ԭ�۵��ܽ��
	private double saveMoney;  //������Ǯ���ܽ��
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
