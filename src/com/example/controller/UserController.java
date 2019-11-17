package com.example.controller;

import java.util.Map;
import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.User;
import com.example.service.UserService;

import net.sf.json.JSONObject;


/**
 * 
 * @author XRDMM
 *
 */
@Controller
@RequestMapping("userController")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("addUser")
	public String addUser(User user){
		System.out.println("注册："+user.getuName()+" "+user.getuPassword());
		
		userService.addUser(user);
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("message", "success");
		map.put("status", "200");
		System.out.println(map);
		System.out.println("注册信息："+user.getuName());	
		//map
		//System.out.println("111222");
		//String string=map.toString();
		//String jsonString = JSON.toJSONString(map);
		//JSONObject jsonObject=JSONObject.fromObject(map); 
		String string=JSONObject.fromObject(map).toString();
		System.out.println("string："+string);
		System.out.println(string);
		
		return string;
	}
/*	public ModelAndView addUser(User user){
		System.out.println("注册："+user.getuName()+" "+user.getuPassword());
		
		userService.addUser(user);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message","success");
		modelAndView.setView(new MappingJackson2JsonView());
		return modelAndView;
	}*/
	
	@ResponseBody
	@RequestMapping("queryUser")
	public User queryUser(String uName) {
		System.out.println("用户名："+uName);
		User user=userService.queryUser(uName);
		System.out.println("用户信息："+user.getuName());
		return user;
	}
	
	@ResponseBody
	@RequestMapping("login")
	public String login(User user) {
		System.out.println("用户信息："+user.getuName());
		String uName=userService.login(user);
		System.out.println("登陆信息："+uName);
		Map<String, String> map=new HashMap<String, String>();
		if (uName==null) {
			//账号密码错误或不存在
			map.put("message", "false");
			map.put("status", "100");			
		}else {
			//账号密码正确
			map.put("message", "success");
			map.put("status", "200");
			map.put("uName", uName);
		}
		System.out.println(map);
		//String string=map.toString();
		//String string = JSON.toJSONString(map);
		//String string=JSONObject.toJSONString(map);
		//System.out.println("111");
		String string=JSONObject.fromObject(map).toString();
		System.out.println("string："+string);
		return string;
	} 
	
	
	/*public ModelAndView login(User user) {	
		ModelAndView mv=new ModelAndView();
		if(userService.login(user)!=null){
            //登录成功，将user对象设置到HttpSession作用范围域中
			mv.addObject("message","success");
			mv.setView(new MappingJackson2JsonView());
			System.out.println("登陆成功");
		}
		else {
			System.out.println("登陆失败");			
		}			
		return mv;	
	}*/
	/*
	@ResponseBody
	@RequestMapping("updatePassword")
	public String updatePassword(User user) {
		System.out.println("用户更改密码");
		
		String uPassword=user.getuPassword();
		
		
		return string;
		
	}*/
	@ResponseBody
	@RequestMapping("editUser")
     public User editUser(User user) 
     {
		System.out.println("用户名："+user.getuName());
		
		Map<String,Object> map=new HashMap<String,Object>();
		if(user!=null) {			
			user.getName();
			user.getAcademy();
			user.getMajor();
			user.getGrade();
			user.getTel(); 
			System.out.println("用户名字："+user.getName()+"学院："+user.getAcademy()
			          +"专业："+user.getMajor()+"年级："+user.getGrade()+"电话"+user.getTel());			
			map.put("massage", user);
			JSONObject jsonMap = JSONObject.fromObject(map);
			System.out.println("打印数据："+""+jsonMap);
		}
		else {
			 map.put("message","false");
		}
		return user;
     }
	
}
