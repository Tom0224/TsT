package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class UserEntity implements Serializable {
		private Integer id;
		private String  email;
		private String  nickname;
		private String  password;
		private Integer  state;
		private List<AddressEntity> add;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Integer getState() {
			return state;
		}
		public void setState(Integer state) {
			this.state = state;
		}
		public List<AddressEntity> getAdd() {
			return add;
		}
		public void setAdd(List<AddressEntity> add) {
			this.add = add;
		}
		public UserEntity(Integer id, String email, String nickname,
				String password, Integer state, List<AddressEntity> add) {
			super();
			this.id = id;
			this.email = email;
			this.nickname = nickname;
			this.password = password;
			this.state = state;
			this.add = add;
		}
		public UserEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "UserEntity [id=" + id + ", email=" + email + ", nickname="
					+ nickname + ", password=" + password + ", state=" + state
					+ ", add=" + add + "]";
		}
		
		
}
