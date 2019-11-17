package com.example.dao;

import org.apache.ibatis.annotations.Param;

import com.example.domain.User;

/**
 * 
 * @author XRDMM
 *
 */
public interface UserMapper {

	/**
	 *	注册
	 */
	public void addUser(User customer);
	
	/**
	 * 登陆
	 */
	public String login(User user);	
	/**
	 * 获取用户信息
	 * @param uName
	 * @return
	 */
	public User queryUser(String uName);
	
	/**
	 * 更改用户密码
	 */
	public String updatePassword(User user);
	/**
	 * 更改用户信息
	 */
	public User editUser(String uName); 
	
}
