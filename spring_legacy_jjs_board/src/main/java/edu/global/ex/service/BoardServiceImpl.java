package edu.global.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.global.ex.mapper.BoardMapper;
import edu.global.ex.vo.BoardVO;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
public class BoardServiceImpl implements BoardService {

   @Autowired
   private BoardMapper mapper;
   
   @Override
   public List<BoardVO> getList() {
      
      log.info("getList..........");      
      return mapper.getList();
   }

}