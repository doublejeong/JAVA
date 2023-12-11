import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Edu230704 {

	public static void main(String[] args) throws IOException {

		// 스택(Stack)의 구현
		Stack<Integer> stack = new Stack<Integer>();

		stack.add(1);
		stack.add(2);

		////////////////////////////////////////////////////

		// 스택의 예
		Deque<String> deq = new ArrayDeque<>();

		// 앞으로 넣고
		deq.offerFirst("1.Box");
		deq.offerFirst("2.Toy");
		deq.offerFirst("3.Roboy");

		// 앞에서 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());

		////////////////////////////////////////////////////

//key-Value 방식의 데이터 저장과 HashMap<K, V> 클래스

		HashMap<Integer, String> map = new HashMap<>();

		// key-Value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "james");
		map.put(23, "Martin");

		// 데이터 탐색
		System.out.println("23번 : " + map.get(23));
		System.out.println("37번 : " + map.get(37));
		System.out.println("45번 : " + map.get(45));
		System.out.println();

		// 데이터 삭제
		map.remove(37);

		// 데이터 삭제 확인
		System.out.println("37번 : " + map.get(37));

//HashMap<K, V> 의 순차적 접근의 예

		// key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();

		// 전체 key 출력 (for-each문 기반)
		for (Integer n : ks) {
			System.out.print(n.toString() + '\t');
		}
		System.out.println();

		// 전체 Value 출력 (for-each문 기반)
		for (Integer n : ks) {
			System.out.print(map.get(n).toString() + '\t');
		}
		System.out.println();

		// 전체 Value 출력 (반복자 기반)
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.print(map.get(itr.next()) + '\t');
		}
		System.out.println();

//////////////////////////////////////////////////////////////////////

//		List<Integer> numList = new LinkedList<>();
//		Scanner sc = new Scanner(System.in);;
//		
//		System.out.println("정수 (-1이 입력 될 때까지)");
//		
//		while(true) {
//			try {
//				int num = sc.nextInt();
//				
//				if(num == -1) {
//					break;
//				}
//				numList.add(num);
//				
//			} catch (Exception e) {
//				System.out.println("잘못된 입력입니다. 다시 넣어주세요");
//				sc = new Scanner(System.in);
//				continue;
//			}
//		}
//		
//		// 큰 값 구하기
//		
//		int maxNum = 0; 
//		for(int num : numList) {
//			if(num > maxNum) {
//				maxNum = num;
//			}
//		}
//		
//		System.out.println(numList);
//		System.out.print("가장 큰 수는? " + maxNum);

//////////////////////////////////////////////////////////////////////
		// I/O

		OutputStream out = new FileOutputStream("data.dat"); // 출력 스트림 생성
		out.write(7); // 7을 저장
		out.close(); // 스트림 종료

		InputStream in = new FileInputStream("data.dat"); // 입력 스트림 생성
		int dat = in.read(); // 데이터 읽음
		in.close(); // 입력 스트림 종료
		System.out.println(dat);

//////////////////////////////////////////////////////////////////////
		// 바이트 단위 입력 및 출력 스트림

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("대상 파일 : ");
//		String src = sc.nextLine();
//		System.out.println("사본 파일 : ");
//		String dst = sc.nextLine();
//		
//		try(BufferedInputStream in1 = 
//                new BufferedInputStream(new FileInputStream(src)) ;
//         BufferedOutputStream out1 = 
//                new BufferedOutputStream(new FileOutputStream(dst))) {
//
//         int data;
//         while(true) {
//             data = in1.read();             
//             if(data == -1)
//                 break;             
//             out.write(data);
//         }
//     
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일이 복사 되었습니다.");

//////////////////////////////////////////////////////////////////////

		try (Writer out1 = new FileWriter("data.txt")) { // 문자 출력 스트림 생성
//			out1.write('A'); 	// 문자 'A' 저장
//			out1.write('한'); 	// 문자 '한' 저장

			for (char ch = 'A'; ch <= 'Z'; ch++) {		// A~Z 까지글자쓰기
				out1.write(ch);
			}

		} catch (Exception e) {
			e.getMessage();
		}

//////////////////////////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일 : ");
		String src = sc.nextLine();
		
		try (Reader in1 = new FileReader(src)) { // 문자 출력 스트림 생성
			int ch;
			
			while(true) {
				ch = in.read();		// 문자를 하나씩 읽는다.
				if(ch == -1)		// 더 이상 읽을 문자가 없다면,
					break;
				System.out.println((char)ch); 	//문자를 하나씩 출력한다.
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		
	}

}
