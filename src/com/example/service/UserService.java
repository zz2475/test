package com.example.service;

import com.example.domain.User;
/**
 * 
 * @author XRDMM
 *
 */
public interface UserService {

	public void addUser(User user);
	
	public String login(User user);
	
	public User queryUser(String uName);
	
	public User editUser(User user) ;
}
