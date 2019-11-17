package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Mission;
import com.example.service.MissionService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 
 * @author XRDMM
 *
 */
@Controller
@RequestMapping("MissionController")
public class MissionController {
	
	@Autowired
	private MissionService missionService;
	
	@ResponseBody
	@RequestMapping("addOrder")
	public String addOrder(Mission order) {
		System.out.println("添加订单："+order.getuName()+" "+order.getMissionNo());
		
		missionService.addOrder(order);
		Map<String, String> map=new HashMap<String,String>();
		map.put("message","success");
		map.put("status","200");
		String string=JSONObject.fromObject(map).toString();
		System.out.println("string："+string);
		//String string=map.toString();
		/*ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message","success");
		modelAndView.setView(new MappingJackson2JsonView());*/ 
		return string;
		
	}
	
	@ResponseBody
	@RequestMapping("queryI")
	public List<Mission> queryI(String uName){
		System.out.println("查询个人发布订单"); 
		List<Mission> list=missionService.queryI(uName);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("queryIReceive")
	public List<Mission> queryIReceive(String receiver){
		System.out.println("查询个人接收订单");
		List<Mission> list=missionService.queryI(receiver);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("query")
	public String query(){		
		List<Mission> list=missionService.query();
		Map<String, String>map=new HashMap<String, String>();
		map.put("message", "success");
		map.put("status", "200");
		/*for(Order order:list) {
			System.out.println("查询订单:"+order.getOrderNo());
		}*/
		//String inventoryResultStr = JSON.toJSON(list).toString();
		//JSONArray jsonArray=new JSONArray(list);
        //System.out.println(jsonArray.toString());
		//list.add(map);
		JSONArray jsonArray = JSONArray.fromObject(list);
		String string=jsonArray.toString();
		System.out.println(string);
		return string;
		
	}
	
	@ResponseBody
	@RequestMapping("receiveOrder")
	public String receiveOrder(Mission order) {
		System.out.println("接受订单");
		missionService.receiveOrder(order);
		Map<String, String> map=new HashMap<String, String>();
		map.put("message", "success");
		map.put("status", "200");
		String string=JSONObject.fromObject(map).toString();
		System.out.println("string："+string);
		//String string=map.toString();
		/*ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message","success");
		modelAndView.setView(new MappingJackson2JsonView());*/
		return string;
	}
	
	
	
}
