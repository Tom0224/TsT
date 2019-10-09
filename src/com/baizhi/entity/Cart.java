package com.baizhi.entity;

import java.util.HashMap;
import java.util.Map;

public class Cart {
		private Map<Integer,Item> map= new HashMap<Integer, Item>();
		private Map<Integer,Item> delete= new HashMap<Integer, Item>();
		private double total;
		public Map<Integer, Item> getMap() {
			return map;
		}
		public void setMap(Map<Integer, Item> map) {
			this.map = map;
		}
		public Map<Integer, Item> getDelete() {
			return delete;
		}
		public void setDelete(Map<Integer, Item> delete) {
			this.delete = delete;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		
		
		
		
}
