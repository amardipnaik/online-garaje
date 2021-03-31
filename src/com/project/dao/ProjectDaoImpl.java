package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.project.bean.GarageBean;
import com.project.bean.UserBean;

@Repository
public class ProjectDaoImpl implements IProjectDao{

	
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

@Override
	public List<UserBean> userList() {
	Session session = this.sessionFactory.getCurrentSession();
	Query query = session.createQuery("from UserBean");
    List<UserBean> userBeanList = query.list();
   
   System.out.println("User Bean List Is :: "+userBeanList.size());
   return userBeanList;
	}

	@Override
	public void addUser(UserBean userbean) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(userbean);
		System.out.println("userbean saved successfully, userbean Details="+userbean);
		
	}

	@Override
	public List<GarageBean> garageList() {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from GarageBean");
       List<GarageBean> garageBeanList = query.list();
       
       System.out.println("Garage Bean List Is :: "+garageBeanList.size());
       return garageBeanList;
	}

	@Override
	public void addGarage(GarageBean garagebean) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(garagebean);
		System.out.println("garagebean saved successfully, garagebean Details="+garagebean);
		
	}




    
 
    
    
    
    

}
