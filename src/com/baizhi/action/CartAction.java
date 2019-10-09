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
		//��ȡcart 
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
		System.out.println("����");
		session.put("cart", cart);
		return "cart";
		
	}
	
	public String deleteCart(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		//��ȡcart 
		Cart cart = (Cart) session.get("cart");
		//��ͨ��cart ��ȡ��dele����
		Map<Integer, Item> map = cart.getMap();
		
		//��map�������ɾ��  book_id �����˽�ֵ
		System.out.println(book_id+"---------");
		map.remove(book_id);
		
		//����ͨ��id��ѯ
		BookService service =  new  BookServiceimpl();
		BookEntity book = service.selectbookid(book_id);
		//��map�������itemɾ��/�Ѳ�ѯ����book���Դ�ŵ�delete������
		//ͨ��������
		Map<Integer,Item> delete= cart.getDelete();
		//����ɾ�����ϵ�item���� 
		Item item = new Item();
		//�Ѳ�ѯ����book����浽ɾ�����ϵ�item ��
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
	
	//ʹ��void ����Ϊ������ҳ��ת
	public void addCart(){
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		Cart cart = (Cart) session.get("cart");
		if(cart == null){
			cart = new Cart();
		}
		//������ﳵ��cart����Ϊ�վͻ�ȡmap���϶�item�������
		Map<Integer, Item> map = cart.getMap();
		if(map.containsKey(book_id)){
			//�����˹��ﳵ������һ
			Item  item = map.get(book_id);
			Integer count = item.getCount()+1;
			System.out.println(count);
			item.setCount(count);
			
		}
		else{
			//�������� ��ӵ����ﳵ��cart
			//�Ȳ�ѯbook��Ϣ
			BookService service =  new  BookServiceimpl();
			BookEntity book = service.selectbookid(book_id);
			Item item = new Item();
			item.setBook(book);
			item.setCount(1);
			
			//book���ݴ�����item�����ٰ�item��ŵ�cart��map��
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
