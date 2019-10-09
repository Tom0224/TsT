package com.baizhi.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.baizhi.entity.UserEntity;
import com.baizhi.service.UserService;
import com.baizhi.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
		private String email;
		private String code;
		private String password;
		private UserEntity user;
		private String uri;
	
	
		public String selectexist(){
			UserService us = new UserServiceImpl();
			//System.out.println(email+"111");
			//System.out.println(password);
			UserEntity user = us.selectexist(email,password);
			//System.out.println(user+"ssss");
			if(user==null){
				return "error";
			}else{
				Map<String, Object> session = ActionContext.getContext().getSession();
				session.put("user", user);
				if(uri.endsWith("login_form.jsp")){
					System.out.println(uri);
					return "success";
				}else{
					String appName=ServletActionContext.getRequest().getContextPath();
					uri=uri.substring(uri.indexOf(appName));
					uri=uri.substring(appName.length()+1);
					return "url";
				}
			}
		}
			
			
		public String getUri() {
			return uri;
		}
		public void setUri(String uri) {
			this.uri = uri;
		}
		public String interUser(){
			ActionContext ac = ActionContext.getContext();
			Map map = ac.getSession();
			String realCode = (String) map.get("code");
			System.out.println(user+"=====");
			if(code!=null && code.equalsIgnoreCase(realCode)){
				
				UserService us = new UserServiceImpl();
				us.interUser(user);
				return "success";
			}
			return "register";
			
		}

		

		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public UserEntity getUser() {
			return user;
		}
		public void setUser(UserEntity user) {
			this.user = user;
		}
		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public String getPassword() {
			return password;
		}




		public void setPassword(String password) {
			this.password = password;
		}



		
		
}
