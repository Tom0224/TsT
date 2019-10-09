package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class CategoryEntity implements Serializable {
	private Integer category_id;
					
	private Integer parent_id;
	private Integer count;
	private String category_name; 
	private List<BookEntity> book;

	private CategoryEntity category;
	
	private List<CategoryEntity>  catrgory;
	public CategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryEntity(Integer category_id, Integer parent_id,
			String category_name, List<BookEntity> book,
			CategoryEntity category, List<CategoryEntity> catrgory) {
		super();
		this.category_id = category_id;
		this.parent_id = parent_id;
		this.category_name = category_name;
		this.book = book;
		this.category = category;
		this.catrgory = catrgory;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public List<BookEntity> getBook() {
		return book;
	}
	public void setBook(List<BookEntity> book) {
		this.book = book;
	}
	public CategoryEntity getCategory() {
		return category;
	}
	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	public List<CategoryEntity> getCatrgory() {
		return catrgory;
	}
	public void setCatrgory(List<CategoryEntity> catrgory) {
		this.catrgory = catrgory;
	}
	@Override
	public String toString() {
		return "CategoryEntity [category_id=" + category_id + ", parent_id="
				+ parent_id + ", count=" + count + ", category_name="
				+ category_name + ", book=" + book + ", category=" + category
				+ ", catrgory=" + catrgory + "]";
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}


	

}
