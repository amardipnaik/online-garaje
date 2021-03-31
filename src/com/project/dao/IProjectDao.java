package com.project.dao;

import java.util.List;

import com.project.bean.GarageBean;
import com.project.bean.UserBean;

public interface IProjectDao {
	
	
	public List<UserBean> userList();
	public void addUser(UserBean userbean) ;
	public List<GarageBean> garageList();
	public void addGarage(GarageBean garagebean) ;
	 
	
	

}
