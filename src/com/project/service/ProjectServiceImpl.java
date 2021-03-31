package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.bean.GarageBean;
import com.project.bean.UserBean;
import com.project.dao.IProjectDao;

@Service
public class ProjectServiceImpl implements IProjectService{
	
	private  IProjectDao projectDao;




public IProjectDao getProjectDao() {
		return projectDao;
	}


	public void setProjectDao(IProjectDao projectDao) {
		this.projectDao = projectDao;
	}


	@Transactional
	public List<UserBean> userList() {
		// TODO Auto-generated method stub
		return projectDao.userList();
	}


	@Transactional
	public void addUser(UserBean userbean) {
		projectDao.addUser(userbean);
		
	}


	@Transactional
	public List<GarageBean> garageList() {
		// TODO Auto-generated method stub
		return projectDao.garageList();
	}


	@Transactional
	public void addGarage(GarageBean garagebean) {
		projectDao.addGarage(garagebean);
		
	}






}
