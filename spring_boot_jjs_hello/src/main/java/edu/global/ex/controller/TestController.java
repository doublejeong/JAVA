package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
//	spring.mvc.view.prefix=/WEB-INF/views/
//	spring.mvc.view.suffix=.jsp
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "test3";
	}

	@RequestMapping("/update")
	public String update() {
		return "board/update";
	}

}
