package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.TaskService;

@Controller
@RequestMapping("TaskController")
public class TaskController {
	/**
	 * 
	 * @author Liu
	 *
	 */
	
	@Autowired
	private TaskService taskService;
	
	
}
