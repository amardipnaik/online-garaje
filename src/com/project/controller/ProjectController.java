package com.project.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.bean.GarageBean;
import com.project.bean.RequestWrapper;
import com.project.bean.UserBean;
import com.project.service.IProjectService;

@RestController
public class ProjectController {

	@Autowired
	IProjectService projectService;
    
	 @RequestMapping(value="/login", method = RequestMethod.POST)
	    public ModelAndView loginMain(HttpServletRequest req, HttpServletResponse res)
	    {
		 
		 	HttpSession session=req.getSession();
	    	String login=req.getParameter("login");
	    	String password=req.getParameter("password");
	    	
	    	
	    	
	    	System.out.println("Login ::"+login);
	    	System.out.println("password ::"+password);
	    	
	    	boolean result=false;
	    	
			try {
				if(login.equalsIgnoreCase("admin")&&login.equalsIgnoreCase("admin"))
				{
					result=true;
				}
				else
				{
					result=false;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String profile=null;
	    	long userId=0;
	    	UserBean user=new UserBean();
	    	
	    	if(result=false)
	    	{
	    		return new ModelAndView("redirect:loginAuth");
	    		
	    	}
	    	
	    	
	    	session.setAttribute("userId",userId );
	    	session.setAttribute("user",user );
	    	
	    	session.setAttribute("profile",profile );
	    	
	    	
	    	session.setAttribute("loggedInUser", req.getAttribute("uname"));
	    	return new ModelAndView("login");
		
	    }
    
	 
	 @RequestMapping(value="/loginAuth", method = RequestMethod.GET)
	    public ModelAndView loginAuth(HttpServletRequest req, HttpServletResponse res)
	    {
		 	return new ModelAndView("loginAuth");
		
	    }
	 

	 
	 
		@RequestMapping(value = "userList", method = RequestMethod.GET)
		public List<UserBean> listuserBean() {
			System.out.println("In Controller userList");
			
			List<UserBean> userBeanList=new ArrayList<>();
			userBeanList=projectService.userList();
			
			return userBeanList;
		}
		
		
		@RequestMapping(value = "garageList", method = RequestMethod.GET)
		public List<GarageBean> listgarageBean() {
			System.out.println("In Controller garageList");
			
			List<GarageBean> garageBeanList=new ArrayList<>();
			garageBeanList=projectService.garageList();
			
			return garageBeanList;
		}
		
		
		
		@RequestMapping(value = "addUserBean", method = RequestMethod.POST)
		public Map<String,String> addCardBean(@RequestBody UserBean userbean) {
			System.out.println("In Controller UserBean");
			Map<String,String> resultMap=new HashMap<String,String>();
		
			
			String status=null;
			
			try {
				projectService.addUser(userbean);
				status="SUCCESS";
			} catch (Exception e) {
				status="ERROR:Kindly Check With Database Connectin";
				
			}
			
			resultMap.put("result", status);
			return resultMap;
			
		}
		
		
		@RequestMapping(value = "addGarageBean", method = RequestMethod.POST)
		public Map<String,String> addGarageBean(@RequestBody GarageBean garagebean) {
			System.out.println("In Controller UserBean");
			Map<String,String> resultMap=new HashMap<String,String>();
		
			
			String status=null;
			
			try {
				projectService.addGarage(garagebean);
				status="SUCCESS";
			} catch (Exception e) {
				status="ERROR:Kindly Check With Database Connectin";
				
			}
			
			resultMap.put("result", status);
			return resultMap;
			
		}
		
		
	 
	 

		@RequestMapping(value = "distanceCalc", method = RequestMethod.POST)
		public String distanceCalc(@RequestBody RequestWrapper request) {
			System.out.println("In Controller distanceCalc");
			String result=null;
			try {
				double lat1=Double.parseDouble(request.getLatitude1());
				double lat2=Double.parseDouble(request.getLatitude2());
				double lon1=Double.parseDouble(request.getLongitude1());
				double lon2=Double.parseDouble(request.getLongitude2());
				double el1=0;
				double el2=0;
				
				double distance=distance(lat1, lat2, lon1, lon2, el1, el2);
				result=String.valueOf(distance);
			} catch (NumberFormatException e) {
				result="You have Entered a Wrong Input";
				e.printStackTrace();
			}
			
			
			return result;
		}
		
	
		public  double distance(double lat1, double lat2, double lon1,
		        double lon2, double el1, double el2) {

		    final int R = 6371; // Radius of the earth

		    double latDistance = Math.toRadians(lat2 - lat1);
		    double lonDistance = Math.toRadians(lon2 - lon1);
		    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
		            + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
		            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		    double distance = R * c * 1000; // convert to meters

		    double height = el1 - el2;

		    distance = Math.pow(distance, 2) + Math.pow(height, 2);

		    return (Math.sqrt(distance)/1000);
		}
		
		
		
	

	
	
}
