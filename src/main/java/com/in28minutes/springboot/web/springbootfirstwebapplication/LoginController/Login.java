package com.in28minutes.springboot.web.springbootfirstwebapplication.LoginController;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.springbootfirstwebapplication.newLogin.checkLogin;

@Controller
public class Login {
	
	@Autowired
	checkLogin newlogin;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "Login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginPost(@RequestParam String name,@RequestParam String pass,ModelMap model) {
		System.out.println(name + pass);
		model.put("name", name);
		return "Welcome";
	}
	
	@RequestMapping(value="/newlogin", method = RequestMethod.GET)
	public String newlogin() {
		return "new";
	}
	
	@RequestMapping(value="/newlogin", method = RequestMethod.POST)
	public String Cofirmnewlogin(@RequestParam String name,@RequestParam String pass,@RequestParam String pass1,ModelMap model) throws Exception {
		newlogin.pass = pass;
		newlogin.ConfirmPass = pass1;
		newlogin.name = name;
		newlogin.insert(name, pass, pass1);
		
		if(newlogin.passcheck()) {
			model.put("name",newlogin.name);
			return "newlogindone";
		}else {
			model.put("Invalid", "Invalid Input");
			return "new";
		}
		
		
		
	}
}
