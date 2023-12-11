package edu.global.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.global.ex.service.BoardService;
import edu.global.ex.service.TransactionTestService;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class TransactionController {

   @Autowired
   private TransactionTestService service;
   
    @GetMapping("/tran/{num}")
    public void transiotn(@PathVariable("num") int num) throws Exception {
          
		if (num == 1) {
			log.info("transionTest1");
			service.transionTest1();
		} else if (num == 2) {
			log.info("transionTest2");
			service.transionTest2();
		} else if (num == 3) {
			log.info("transionTest3");
			service.transionTest3();
		} else if (num == 4) {
			log.info("transionTest4");
			service.transionTest4();
		} else if (num == 5) {
			log.info("transionTest5");
			service.transionTest5();
		} else if (num == 6) {
			log.info("transionTest6");
			service.transionTest6();
		}
       
    }
   
}