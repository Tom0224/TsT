package com.baizhi.action;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.baizhi.entity.BookEntity;
import com.baizhi.entity.Cart;
import com.baizhi.entity.Item;
import com.baizhi.service.BookService;
import com.baizhi.service.impl.BookServiceimpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport {
	private Integer book_id;
	
	private Integer count;
	public String inserrtCart(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		//获取cart 
		Cart cart = (Cart) session.get("cart");
		Map<Integer, Item> delete = cart.getDelete();
		delete.remove(book_id);
		BookService service =  new  BookServiceimpl();
		BookEntity book = service.selectbookid(book_id);
		Map<Integer, Item> map = cart.getMap();
		Item item = new Item();
		item.setBook(book);
		item.setCount(1);
		
		map.put(book_id, item);
		
		Set<Integer> set = cart.getMap().keySet();
		for(Integer i : set){
			Double prive = cart.getMap().get(i).getBook().getBook_prive();
			Double dang = cart.getMap().get(i).getBook().getDangproce();
			
//			Item  item = map.get(book_id);
			if(item.getCount()!=1){
				prive +=prive;
				dang += dang;
			}
			item.setTotalMoney(prive);
			item.setSaveMoney(dang);
			
		}
		System.out.println("经过");
		session.put("cart", cart);
		return "cart";
		
	}
	
	public String deleteCart(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		//获取cart 
		Cart cart = (Cart) session.get("cart");
		//在通过cart 获取到dele集合
		Map<Integer, Item> map = cart.getMap();
		
		//把map里的数据删除  book_id 代表了建值
		System.out.println(book_id+"---------");
		map.remove(book_id);
		
		//在在通过id查询
		BookService service =  new  BookServiceimpl();
		BookEntity book = service.selectbookid(book_id);
		//把map几个里的item删除/把查询到的book属性存放到delete集合里
		//通过创建的
		Map<Integer,Item> delete= cart.getDelete();
		//创建删除集合的item对象 
		Item item = new Item();
		//把查询到的book对象存到删除集合的item 里
		item.setBook(book);
		delete.put(book_id,item);
		return "cart";
		
		
	}
	public String updateCount(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		Cart cart = (Cart) session.get("cart");
		Map<Integer, Item> map = cart.getMap();
		
		Item  item = map.get(book_id);
		item.setCount(count);
		System.out.println(item);
		
		Set<Integer> set = cart.getMap().keySet();
		for(Integer i : set){
			Double pr = cart.getMap().get(i).getBook().getBook_prive();
			Double da = cart.getMap().get(i).getBook().getDangproce();
			Double dang = 0.0;
			Double prive = 0.0;
			Item  item1 = map.get(book_id);
			for(int a=1;a<=item1.getCount();a++){
				prive +=pr;
				dang += da;
			}
			

			item.setTotalMoney(prive);
			item.setSaveMoney(dang);
			
		}
		double total = 0;
		for(Integer i : set){
			double save = cart.getMap().get(i).getSaveMoney();
			total += save;
		}
		System.out.println(total+"===========");
		cart.setTotal(total);
		return "cart"; 
	}
	
	//使用void 是因为不让网页跳转
	public void addCart(){
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		Cart cart = (Cart) session.get("cart");
		if(cart == null){
			cart = new Cart();
		}
		//如果购物车（cart）不为空就获取map集合对item添加数据
		Map<Integer, Item> map = cart.getMap();
		if(map.containsKey(book_id)){
			//存在了购物车数量加一
			Item  item = map.get(book_id);
			Integer count = item.getCount()+1;
			System.out.println(count);
			item.setCount(count);
			
		}
		else{
			//不存在了 添加到购物车里cart
			//先查询book信息
			BookService service =  new  BookServiceimpl();
			BookEntity book = service.selectbookid(book_id);
			Item item = new Item();
			item.setBook(book);
			item.setCount(1);
			
			//book数据存贮到item里了再把item存放到cart的map里
			map.put(book_id,item);
			
		}
	
	

		Set<Integer> set = cart.getMap().keySet();
		for(Integer i : set){
			Double pr = cart.getMap().get(i).getBook().getBook_prive();
			Double da = cart.getMap().get(i).getBook().getDangproce();
			
			Item  item = map.get(book_id);
			double prive = 0;
			double dang = 0;
				prive += pr*item.getCount();
				dang +=da*item.getCount(); 		
			item.setTotalMoney(prive);
			item.setSaveMoney(dang);
			
		}
		double total = 0;
		for(Integer i : set){
			double save = cart.getMap().get(i).getSaveMoney();
			total += save;
		}
		System.out.println(total+"===========");
		cart.setTotal(total);
		session.put("cart", cart);
	}
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

}
