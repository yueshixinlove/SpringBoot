package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.TAdmin;

public interface TAdminMapper {
   

    TAdmin selectByPrimaryKey(Integer id);

  
}