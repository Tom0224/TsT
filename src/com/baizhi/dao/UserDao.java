package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.UserEntity;

public interface UserDao {
	public UserEntity selectexist(@Param("email")String email,@Param("password")String passwoerd);
	public void interUser(UserEntity user);
}
