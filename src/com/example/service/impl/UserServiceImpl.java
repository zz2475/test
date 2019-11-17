package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserMapper;
import com.example.domain.User;
import com.example.service.UserService;
/**
 * 
 * @author XRDMM
 *
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	
	//@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 
	//通过 @Autowired的使用来消除 set ，get方法。
	//对一个bean配置起属性时，是用
	//<property name="属性名" value=" 属性值"/>  
	
	@Autowired
	UserMapper userMapper;
					//�Ƿ���ֻ������		������Ϊ						���뼶��
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void addUser(User user) {
		System.out.println("Seriver:注册");
		userMapper.addUser(user);
		
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public User queryUser(String uName) {
		User user=userMapper.queryUser(uName);
		System.out.println("用户信息："+user.getuName());
		return user;
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public String login(User user) {
		String uName=userMapper.login(user);
		System.out.println("Seriver账号："+uName);
		return uName;
	}


	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public User editUser(String uName) {
		User user=userMapper.editUser(uName);
		System.out.println("用户信息："+user.getuName());
		return user;
	}

	public User editUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
