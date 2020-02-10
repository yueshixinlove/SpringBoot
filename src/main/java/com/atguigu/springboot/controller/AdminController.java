package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.service.AdminService;

//@Controller
@RestController   //组合注解代替了@Controller、@ResponseBody
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	//@ResponseBody
	@RequestMapping("/get/{id}")
	public TAdmin get( @PathVariable("id") Integer id) {
		return adminService.getAdminById(id);
		
	}
}
