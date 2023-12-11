import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigInteger;

class Board {
	
}

class PBoard extends Board {
	
}


//1. 안죽게 하려고
//2. 예외 처리
public class Edu230629 {
	
	public static void exceptTest() throws IOException {
		
	}

	public static void main(String[] args)  {

//		Scanner kb = new Scanner(System.in);
//		
//		try {
//			System.out.print("a/b...a?");
//			int n1 = kb.nextInt();		//int형 정수 입력
//			
//			System.out.print("a/b...b?");
//			int n2 = kb.nextInt();		//int형 정수 입력
//			
//			System.out.println(n1 / n2);
//			
//		} catch (ArithmeticException | InputMismatchException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} 
//	
//		System.out.println("Good Bye~~!");
		
		//////////////////////////////////////////
		
		
//		Board pbd1 = new PBoard();
//		PBoard pbd2 = (PBoard)pbd1;	//OK
//		
//		System.out.println(".. intermediate location..");
//		Board ebd1 = new Board();
//		PBoard ebd2 = (PBoard)ebd1;	//Exception
		
		//////////////////////////////////////////

		Path file = Paths.get("C:\\javastudy\\simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//////////////////////////////////////////

		int num, answer;
		boolean sel = true;
		int count = 0;
		
		answer = (int)(Math.random() * 100) +1;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			while (sel) {
				System.out.print("1~100 숫자 맞추기. 숫자를 입력하세요 : ");
				num = sc.nextInt();

				count++;
				if (num < answer) {
					System.out.println("up");

				} else if (num > answer) {
					System.out.println("down");
				} else {
					System.out.println("정답" + count + "번째 만에 맞혔습니다");
					System.out.println();
					sel = false;
				}
			}

		} catch (Exception e) {
			System.out.println("숫자를 올바르게 입력하세요");
		}
		
		/////////////////////////////////////////////
		
		Integer num1 = new Integer (29);
		Integer iObj = 10;	//오토 박싱
		iObj++;
		
		System.out.println(iObj);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());

		Double num2 = new Double (3.14);
		
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());
		
		/////////////////////////////
		
		//클래스 메소드를 통한 인스턴스 생성 방법 두가지
		Integer n1 = Integer.valueOf(5);	//숫자 기반 Integer 인스턴스 생성
		Integer n2 = Integer.valueOf("1024");	//문자열 기반 Integer 인스턴스 생성
		
		//대소 비교와 합을 계산하는 클래스 메소드
		System.out.println("큰 수 : " + Integer.max(n1,n2));
		System.out.println("작은 수 : " + Integer.min(n1,n2));
		System.out.println("합 : " + Integer.sum(n1,n2));
		System.out.println();
		
		//정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		System.out.println("12의 2진 표현 : " + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현 : " + Integer.toOctalString(12));
		System.out.println("12의 16진 표현 : " + Integer.toHexString(12));
		
		/////////////////////////////////////////////
		
//		매우 큰 정수 표현 위한 java.math.BigInteger 클래스
		
		//long형으로 표현 가능한 값의 크기 출력
		System.out.println("최대 정수: " + Long.MAX_VALUE);
		System.out.println("최소 정수: " + Long.MIN_VALUE);
		System.out.println();
		
		//매우 큰 수를 BigInteger 인스턴스로 표현
		BigInteger big1 = new BigInteger("100000000000000000000");
		BigInteger big2 = new BigInteger("-99999999999999999999");
		
		// BigInteger 기반 덧셈 연산
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈 결과:" + r1);

		// BigInteger 기반 곱셈 연산
		BigInteger r2 = big1.add(big2);
		System.out.println("곱셈 결과:" + r2);
		System.out.println();
		
		//인스턴스에 저장된 값을 int형 정수로 반환
		int num0 = r1.intValueExact();
		System.out.println("From BigInteger: " + num0);
		
		/////////////////////////////////////////////

		
		
		
	}
}
