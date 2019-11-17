package com.example.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.domain.Mission;
import com.example.domain.MissionType;
import com.example.domain.User;
import com.example.service.MissionService;
import com.example.service.UserService;


/**
 * 
 * @author XRDMM
 *
 */
public class MyBatisSpringTest {

	@Test
	public void test(){
		//
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = ac.getBean(UserService.class);
		
		User user = new User();
		user.setuName("111");
		user.setuPassword("1");
		/*user.setName("1hao");
		user.setAcademy("�����ѧԺ");
		user.setMajor("�������");
		user.setGrade("3��");
		user.setTel("15816100000");*/
		
		//userService.addUser(user);
		String uName="201710098001";
		userService.login(user);
	}
	
	//@Test
	public void testOrder(){
		//
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MissionService orderService = ac.getBean(MissionService.class);
		/*Order order=new Order();
		order.setOrderName("ûɶ��");
		order.setOrderType(OrderType.GROUP);
		order.setOrderDetail("modei");
		order.setStartTime(new Date(System.currentTimeMillis()));
		order.setEndTime(new Date(System.currentTimeMillis()));
		order.setuName("201710098003");
		
		orderService.addOrder(order);*/
		
		//String uName="201710098000";
		//List<Order> list=orderService.Iquery(uName);;
		/*for(Order order :list) {
			System.out.println("�����ߣ�"+order.getuName());
			System.out.println("�����ţ�"+order.getOrderNo());
			
		}*/
		
		//Order order=new Order();
		//order.setReceiver("201710098003");
		//order.setOrderNo(1);
		//orderService.receiveOrder(order);
		String orderType=MissionType.GROUP.toString();
		System.out.println(orderType);
		List<Mission> orders=orderService.query();
		for(Mission order :orders) {
			System.out.println("Seriver订单类型："+order.getMissionNo());
		}
		
	}
	
	//@Test
	public void testLogin() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = ac.getBean(UserService.class);
		User user = new User();
		user.setuName("123");
		user.setuPassword("123");
		userService.login(user); 
	}
	@Test
	public void testupdate() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = ac.getBean(UserService.class);
		User user = new User();
		String uName="20171008";
		user.setName("小明");
		user.setAcademy("计算机");
		user.setMajor("软件工程");
		user.setGrade("17软4");
		user.setTel("15816100000");
		userService.editUser(user); 
	}
}
