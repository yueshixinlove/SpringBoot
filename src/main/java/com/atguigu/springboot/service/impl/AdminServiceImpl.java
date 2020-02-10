package com.atguigu.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.dao.TAdminMapper;
import com.atguigu.springboot.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	TAdminMapper adminMapper;
	@Override
	public TAdmin getAdminById(Integer id) {
		// TODO Auto-generated method stub
		return adminMapper.selectByPrimaryKey(id);
	}
	
}
