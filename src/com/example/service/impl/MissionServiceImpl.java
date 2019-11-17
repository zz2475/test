package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MissonMapper;
import com.example.domain.Mission;
import com.example.service.MissionService;
/**
 * 
 * @author XRDMM
 *
 */

@Service("orderService")
@Transactional
public class MissionServiceImpl implements MissionService{
	
	@Autowired
	MissonMapper orderMapper;
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void addOrder(Mission order) {
		System.out.println("Seriver:添加成功");
		orderMapper.addOrder(order);
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public List<Mission> queryI(String uName) {
		System.out.println("Seriver:查询个人发布订单");
		List<Mission> list=orderMapper.queryI(uName);
		return list;
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public List<Mission> queryIReceive(String receiver) {
		System.out.println("Seriver:查询个人接收订单");
		List<Mission> list=orderMapper.queryIReceive(receiver);
		return list;
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public List<Mission> query() {
		System.out.println("Seriver:查询所有订单");
		List<Mission> list=orderMapper.query();
		return list;
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public List<Mission> queryType(String orderType) {
		System.out.println("Seriver:根据订单类型查询");
		List<Mission> list=orderMapper.queryType(orderType);
		return list;
	}
	
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void receiveOrder(Mission order) {
		orderMapper.receiveOrder(order);
		System.out.println("Seriver：接收订单:"+"订单号:"+order.getMissionNo());
		
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void completeOrder(Mission order) {
		orderMapper.completeOrder(order);
		System.out.println("Seriver：完成订单:"+"订单号:"+order.getMissionNo());
		
	}





}
