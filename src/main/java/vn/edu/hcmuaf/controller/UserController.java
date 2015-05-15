package vn.edu.hcmuaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import vn.edu.hcmuaf.model.User;
import vn.edu.hcmuaf.service.UserService;

@Controller
@RequestMapping(value = "/User")
public class UserController {
	@Autowired
	private UserService userServices;

	@RequestMapping(value = "/layout")
	public String getIndexPage() {
		return "DangNhap";
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	public @ResponseBody User login(String email, String password) {
		System.out.println(email + password);
		return userServices.login(email, password);
	}
}
