package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> getList();	//리스트 메소드
	BoardVO read(int bid);		//글보기 메소드
	int modify(BoardVO voard);	//글수정
	int remove(BoardVO boardVO);	//글삭제
	void register(BoardVO boardVO);
	void registerReply(BoardVO boardVO);	//답변등록
	
	// 페이징 처리 함수
	int getTotal();
	List<BoardVO> getListWithPaging(Criteria cri);
}
