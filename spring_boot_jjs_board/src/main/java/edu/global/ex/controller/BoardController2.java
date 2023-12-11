package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.page.Criteria;
import edu.global.ex.page.PageVO;
import edu.global.ex.service.BoardService;
import edu.global.ex.service.BoardService1;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;


/*
1. interface는 필요가 없음 
2. sqlSession에서 제공하는 함수(selectList,selectOne)를 이용함
3. 쿼리구현을 위한 XML이 필요. 해당 XML의 namespace는  개발자가가 정함
* 
* */

@Slf4j
@Controller
public class BoardController2 {

   @Autowired
   private BoardService1 boardService;
   
   @GetMapping("/list11")
   public String list10(Model model) throws Exception {
      log.info("list11() ..");
      
      model.addAttribute("boardList",boardService.selectBoardList());
      
      return "/board/list";
   }
   

   
}