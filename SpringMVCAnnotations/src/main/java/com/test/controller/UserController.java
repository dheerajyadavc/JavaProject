package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.dao.User;

@ComponentScan
@Controller
public class UserController {
	private List<User> userList = new ArrayList<User>();

	@RequestMapping(value = "/AddUser.htm", method = RequestMethod.GET)
	public String showForm() {
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("AddUser.jsp");
		User user = new User();
		model.addObject(user);
		
		return "AddUser";
	}

	@RequestMapping(value = "/AddUser.htm", method = RequestMethod.POST)
	public @ResponseBody String addUser(@ModelAttribute(value = "user") User user, BindingResult result)
	{
		String returnText;
		if (result.hasErrors()) {
			userList.add(user);
			returnText = "User has been added to the list. The total no:of users are " + userList.size();
		} else {
			returnText = "Sorry user cannot be added to the list";

		}
		return returnText;

	}
	
	@RequestMapping(value="/ShowUsers.htm")
	public String showUsers(ModelMap model){
		model.addAttribute("Users",userList);
		return "showUsers";
	}
}
