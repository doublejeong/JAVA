import java.util.Scanner;

public class Edu230623 {

	public static void main(String[] args) {

		String st1 = "Coffee";
		String st2 = "Bread";

		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		
		////////////////////////
		
		String str = "abcdefg";
		str.substring(2);
		
		////////////////////////
		
		double e = 3.141592;
		String se = String.valueOf(e);
		
		System.out.println(se);
		
		/////////////////////
		
		StringBuilder stbuf = new StringBuilder("123");
//		문자열 "123"이 저장된 인스턴스의 생성
		stbuf.append(45678);	//문자열 덧붙이기
		System.out.println(stbuf.toString());
		
		stbuf.delete(0, 2);		//문자열 일부 삭제
		System.out.println(stbuf.toString());
		
		stbuf.replace(0,3,"AB");	//문자열 일부 교체
		System.out.println(stbuf.toString());
		
		stbuf.reverse();		//문자열 내용 뒤집기
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2,4);	//일부만 문자열로 반환
		System.out.println(sub);
		
		///////////////////////////////
		
//		Scanner sc = new Scanner(System.in);	//Scanner 인스턴스 생성
//		
//		System.out.print("국어:");
//		int kor = sc.nextInt();		//int형 데이터 추출
//		System.out.print("영어:");
//		int eng = sc.nextInt();		//int형 데이터 추출
//		System.out.print("수학:");
//		int math = sc.nextInt();	//int형 데이터 추출
//		
//		int sum = kor + eng + math;
//		System.out.println(sum);
		
		
		//////////////////////////////////
//		배열
		int num = 5;
		
		// 선언 방법 = 메모리 할당
		int[] arrNum = new int[5];
		double[] arrDou = new double[5];
		long[] arrLong = new long[7];
		
		System.out.println(arrNum.length);	//여기에 붙는 length는 함수가 아닌 변수이다.
		System.out.println(arrDou.length);	//여기에 붙는 length는 함수가 아닌 변수이다.
		
		arrNum[0] = 1;
		arrNum[1] = 2;
		arrNum[2] = 3;
		arrNum[3] = 4;
		arrNum[4] = 5;

		System.out.println(arrNum[2]);
		System.out.println(arrNum[1]);
		
		System.out.println("-----------");
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
		
		System.out.println("------로또-------");
		//로또...
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 45 + 1));
		
//		String[] arrStr = new String[5];
//		Circle2[] arrCircle = new Circle2[5];
		
		//////////
		System.out.println("----*--로또--*-----");
		int[] arrLotto = new int[6]; 	//변수선언
		
		for (int i = 0; i < arrLotto.length; i++) {
			arrLotto[i] = (int)(Math.random() * 45 + 1);	//입력
			
			for (int j = 0; j < i; j++) {
				if (arrLotto[i] == arrLotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < arrLotto.length; i++) {
			System.out.println(arrLotto[i]);				//출력
		}
		
		/////////////////////
		
		String[] arrStr = new String[2];
		arrStr[0] = "String 1";
		arrStr[1] = "String 2";
		
		System.out.println(arrStr[0].length());
		System.out.println(arrStr[1].length());
		
		int sum = 0;
		for (int i = 0; i < arrStr.length; i++) {
			sum = sum + arrStr[i].length();
		}
		System.out.println(sum);
		
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		
		/////////////////////////
		
		Circle2[] arrCircle = new Circle2[2];
		
		arrCircle[0] = new Circle2(10.0);
		arrCircle[1] = new Circle2(5);
		
		double area = 0;
		for (int i = 0; i < arrCircle.length; i++) {
			area = area + arrCircle[i].getArea(); 
		}
		System.out.println(area);
		
		///////////////////////////
		
		Rectangle11[] arrRec = new Rectangle11[2];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arrRec.length; i++) {
			
			System.out.print("가로 : ");
			int width = sc.nextInt();	
			System.out.print("세로 : ");
			int height = sc.nextInt();	
			
			arrRec[i] = new Rectangle11(width, height);
		}
		
		double areaRec = 0;
		
		for (int i = 0; i < arrRec.length; i++) {
			areaRec = areaRec + arrRec[i].getArea();
		}
		System.out.println(areaRec);
	}

}
