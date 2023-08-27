package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.vo.CircleVO;
import edu.global.ex.vo.UserVO;

@Controller
@RequestMapping("/user/*")
public class UsersController {
	
	@GetMapping("/login")
	public String login() {
		
		return "/user/login";
	}
	
}
