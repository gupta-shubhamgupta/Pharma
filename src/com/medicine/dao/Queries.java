package com.medicine.dao;

public interface Queries {
	
	String ADD_MEDICINE="insert into medicine values(?,?,?,?,?,?)";
	String DELETE_MEDICINE="delete from medicine where batch_code=?";
	String SEARCH_MEDICINE="select * from medicine where batch_code=?";
	String UPDATE_MEDICINE="update medicine set medicine_code=?,weight=?,price=?,medicine_type=?,refrigeration=? where batch_code=?";
	String ADD_USER="insert into user values(?,?,?,?,?,?)";
	String USER_LOGIN="select * from user where user_id=? and password=?";
	String FORGET_PASSWORD="update user set password=? where user_id=? and dob=?";
	String DELETE_USER="delete from user where user_id=? ";
	String ADD_ADMINUSER="insert into admin values(?,?,?)";
	String ADMIN_LOGNIN="select * from admin where user_id=? and password=?";
	String ADMINFORGETPASS="update admin set password=? where user_id=? and dob=?";
}