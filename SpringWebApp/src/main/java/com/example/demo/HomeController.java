package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller						//this signifies this class as a controller
public class HomeController {
	//define the methods
	
	@RequestMapping				//used to on the method in the controller that handles a request
	public String home(HttpServletRequest req) {		//to accept user client data, create an object of type HttpSerletRequest/HttpServletResponse as a parameter
		 
		//capture the data by its name
		String Name = req.getParameter("name");
		System.out.println("I love " + Name);	//this prints in the console on server start
		//create a session that will be used to send the data to the client
		HttpSession session = req.getSession();
		session.setAttribute("name", Name); 	//the key in the session is Name and the value is name
		
		return "home";		//this instructs the controller to render the requested page
	}
}
