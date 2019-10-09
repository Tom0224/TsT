package com.baizhi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.UserEntity;

public interface UserService {
	public UserEntity selectexist(String email,String passwoerd);
	public void interUser(UserEntity user);

}
