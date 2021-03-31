package com.project.service;

import java.util.List;

import com.project.bean.GarageBean;
import com.project.bean.UserBean;


public interface IProjectService {
	
	
	public List<UserBean> userList();
	public void addUser(UserBean userbean) ;
	public List<GarageBean> garageList();
	public void addGarage(GarageBean garagebean) ;
	

}
