//
//class Accumulator {
//	private static int sum = 0;
//
//	public static void add(int i) {
//
//		sum = sum + i;
//	}
//
//	public static void showResult() {
//		System.out.println("sum = " + sum);
//	}
//	
//}

class Accumulator {

	static int sum = 0;

	public static void add(int i) {
		sum = sum + i;		
	}
	static void showResult() {
		System.out.println("sum="+sum);
	}
}

public class NotePad2 {

	public static void main(String[] args) {
		
//		for (int i = 0; i <= 10; i++) {
//			
//			Accumulator.add(i);		//전달되는 값을 모두 누적
//		}
//		Accumulator.showResult();	//최종 누적 결과를 출력
//		
//		
//		String str1 = new String("Simple String");
//		String str2 = "The Best String";
//		
//		System.out.println(str1);
//		System.out.println(str1.length());
//		System.out.println();		//개행
//		
//		System.out.println(str2);
//		System.out.println(str2.length());
//		System.out.println();
//		
//		////////////////////
//		
//		String str11 = "Simple String";
//		String str22 = "Simple String";
//
//		String str33 = new String("Simple String");
//		String str44 = new String("Simple String");
//		
//		if (str11 == str22) {
//			System.out.println("동일");
//		}else {
//			System.out.println("다른");
//		}
//		
////		다른 언어에서는 이렇게 쓰기때문에 헷갈리기 쉽다(자바스크립트, 파이선...)
//		if (str33 == str44) {
//			System.out.println("동일");
//		}else {
//			System.out.println("다른");
//		}
//
//		if (str33.equals(str11)) {
//			System.out.println("동일");
//		}else {
//			System.out.println("다른");
//		}
//		str11 = str11+str22;
//		System.out.println(str11);
		
		
		//////////////////////
		
		for (int i = 0; i <= 10; i++) {
			Accumulator.add(i); // 전달되는 값을 모두 누적

		}
		Accumulator.showResult(); // 최종 누적 결과를 출력"
		
		
	}
	
	
	
	

}
