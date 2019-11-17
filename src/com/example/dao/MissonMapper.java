package com.example.dao;

import java.util.List;
/**
 * 
 * @author XRDMM
 *
 */


import com.example.domain.Mission;
public interface MissonMapper {

	/**
	 * 添加订单
	 * @param order
	 */
	public void addOrder(Mission order);
	
	/**
	 * 查询个人发布订单
	 * @param uName
	 * @return
	 */
	public List<Mission> queryI(String uName);
	
	/**
	 * 查询个人接收订单
	 * @param receive
	 * @return
	 */
	public List<Mission> queryIReceive(String receiver);
	
	/**
	 * 查询他人订单
	 * @return
	 */
	public List<Mission> query();
	
	
	/**
	 * 查询他人类型订单
	 * @return
	 */
	public List<Mission> queryType(String orderType);
	
	
	/**
	 * 接收订单
	 * @param order
	 */
	public void receiveOrder(Mission order);
	
	/**
	 * 完成订单
	 * @param order
	 */
	public void completeOrder(Mission order);
}
