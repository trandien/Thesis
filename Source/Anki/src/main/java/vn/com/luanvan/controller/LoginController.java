package vn.com.luanvan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.com.luanvan.dao.UserDao;
import vn.com.luanvan.dao.UserDaoImpl;
import vn.com.luanvan.model.User;
import vn.com.luanvan.service.UserService;
import vn.com.luanvan.service.UserServiceImpl;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	//@Autowired
	//UserDao userDao;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView formCreateProject(ModelAndView model) {
		System.out.println("xxxxxxxxxxxx");
	//	userService = new UserServiceImpl();
			User user = new User("tranthanhdien@gmail.com", "123456", "Tran Thanh Dien", null);
			userService.add(user);
			System.out.println("Save thanh cong " +user.getName());
		
		
		model.setViewName("login");
		return model;
	}
}
