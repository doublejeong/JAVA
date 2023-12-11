package consoleBoard;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {		// 게시판 기능
	Scanner scanner = new Scanner(System.in);
	List<BoardVO> boardList = new ArrayList<>();	// 게시글 객체를 저장할 List

	public void getBoardList() {	// 게시판 목록 불러오기
		System.out.println("==========================================");
		System.out.println("번호        제목            작성자    작성일    ");
		System.out.println("------------------------------------------");
		if (boardList.isEmpty()) {	// 게시글 객체들을ㅇ 담은 리스트에 아무것도 없는 경우
			System.out.println("       게시글 없음       ");
		} else {
			for (BoardVO vo : boardList) {	// 글 번호를 1부터 시작하기 위해 인덱스 +1
				System.out.printf(" %-3d %-15s %3s %-1s \n", boardList.indexOf(vo) + 1,
						vo.getTitle(), vo.getWriter(), vo.getRegistDate());
			}
		}
		System.out.println("------------------------------------------");
		System.out.println("(1. 목록, 2. 등록, 3.내용, 4. 삭제, 0. 종료) > ");
	}

	public void boardInsert() {		// 게시글 새로쓰기
		BoardVO vo = new BoardVO();	// 게시글 객체 생성
		
		System.out.println("제목 > ");	// 제목 입력
		String title = scanner.nextLine();
		if (title.equals("종료")) {
			System.out.println("작성이 취소되었습니다.");
			return;
		}
		
		System.out.println("내용 > ");	// 내용 입력
		String content = scanner.nextLine();
		if (content.equals("종료")) {
			System.out.println("작성이 취소되었습니다.");
			return;
		}
		
		System.out.println("작성자 > ");	// 작성자 입력
		String writer = scanner.nextLine();
		if (writer.equals("종료")) {
			System.out.println("작성이 취소되었습니다.");
			return;
		}
		
		vo.setNum(boardList.indexOf(vo));	// 인덱스를 객체 번호에 저장
		vo.setTitle(title);		// 글 제목 저장
		vo.setWriter(writer);	// 글 작성자 저장	
		vo.setContnet(content);	// 글 내용 저장
		
		// 현재 날짜 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String registDate = sdf.format(new Date());
		vo.setRegistDate(registDate);
		
		boardList.add(vo);	// List에 현재 작성한 게시글 저장
		System.out.println("글이 정상적으로 추가 되었습니다. \n");
		
	}

	public void boardDetail(int select) {	// 게시글 상세보기
		if (boardList.isEmpty()) {		// boardList가 비어 있다면
			System.out.println("게시글이 존재하지 않습니다.");
			return;
		}
		BoardVO vo = new BoardVO();		// 게시글 객체 생성
		vo = boardList.get(select - 1);		// 인덱스 = 글번호 -1. 해당 인덱스의 객체를 가져옴
		System.out.println("글 번호 : " + select);	// 글 번호가 1부터 시작해서 +1
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("작성자 : " + vo.getWriter());
		System.out.println("-----------------------------------------");
		System.out.println(vo.getContent());
		System.out.println("-----------------------------------------");
		
	}
	
	public void boardDelete(int select) {	// 게시글 삭제
		if(boardList.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return;
		}
		
		BoardVO vo = new BoardVO();
		vo =  boardList.get(select - 1); 	// 선택한 번호의 객체
		boardList.remove(boardList.indexOf(vo)); 	//해당 인덱스에 있는 객체 삭제
		System.out.println(select + "번 글이 삭제되었습니다.");
	}
	
	public void txtRead() throws Exception {	// 입력 스트림 (메모장 파일 읽기)
		Reader reader = new FileReader("desktop/BoardDB.txt"); // 해당 경로를 참조하는 입력 스트림 객체 생성
		while (true) {
			int data = reader.read();	// 데이터를 한 문자씩 읽어옴, 숫자로 저장
			if (data == -1)		// 데이터가 없는 경우
				break;
			System.out.println((char)data);		// 받아온 데이터를 문자로 변환하여 출력
		}
		reader.close();		// 입력 스트림 닫기
		System.out.println("데이터 로드 완료");
	}

	public void txtWrite() throws Exception {	// 출력 스트림 (메모장 파일 쓰기)
		Writer writer = new FileWriter("desktop/BoardDB.txt"); // 해당 경로를 참조하는 출력 스트림 객체 생
		String[] data = new String[1000];		// 내보낼 문자열을 저장할 변수
		for (int i = 0; i < boardList.size(); i++) { //boardList의 객체를 하나씩 불러 data에 해당 값들을 저장
			BoardVO vo = boardList.get(i);
			data[i] = boardList.indexOf(vo) + "\t" + vo.getTitle() + "\t" + vo.getContent() 
					+ "\t" + vo.getWriter() + "\t" + vo.getRegistDate() + "\t\n";
			writer.write(data[i]);		// 받아온 데이터를 출력
		}
		
		writer.flush(); 	// 버퍼에 남은 데이터를 파일로 출력(write) 후 버퍼를 비움
							// 버퍼가 꽉 차기 전에 프로그램이 종료되면 버퍼에 남아있는 내용이
							// 파일로 출력이 되지 않기 때문에 사용 (사용자가 원할 때 사용하면 됨)
		writer.close(); 	// 출력 스트림 닫기
		System.out.println("현재 데이터 저장완료");
	}

}
