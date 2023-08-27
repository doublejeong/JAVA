package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.service.EmpService;
import edu.global.ex.vo.CircleVO;
import edu.global.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller		// @Component + 의미  // EmpController empController = new EmpController()
@RequestMapping("/emp/*")
public class EmpController {
	
	@Autowired
	private EmpService empService;

	@GetMapping("/list")
	public String list(Model model) {
		
		log.info("list()..");
		
		model.addAttribute("emps", empService.getList());
		
		return "/emp/list";
	}
	

}
