
public class Hello {

	public static void hiEveryone() {
		System.out.println("안녕하세요.");		
	}
	public static void hiCar() {
		System.out.println("안녕하세요 함수 입니다.");
		showFunction ();
	}
	
	public static void showFunction() {
		System.out.println("함수1");
		System.out.println("함수2");
	}
	
	public static void showStar1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

//	변수 선언 = 파라미터 = 인
	public static void showAge(int age, int tall) {
		System.out.println("제 나이는 " + age + "입니다.");
		System.out.println("제 키는 " + tall + "입니다.");
	}
	
	
//	함수 만드는 법
//	
//	리턴타입 함명(파라미터들) {
//		return 리턴값
//	}
	public static int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int sub(int num1,int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int mul(int num1,int num2) {
		return num1 * num2;
	}
	public static char gradChar(double avg) {
		char result;
		if (avg >= 90) {
			result = '수';
		} else if (avg >= 80) {
			result = '우';
		} else if (avg >= 70) {
			result = '미';
		} else if (avg >= 60) {
			result = '양';
		} else {
			result = '가';
		}
		return result;
	}
	public static void showStar(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		hiCar ();
		hiEveryone ();
		showFunction ();
		showStar1();
		showAge(19,180);	//value = 값 = 변수값	
		showAge(29,160);
		
		int height = 190;
		showAge(29,height);

		System.out.println(add(3,5));
		System.out.println(sub(3,5));	//-2
		System.out.println(mul(3,5));	//15
		
		System.out.println(gradChar(90.8));		//수
		System.out.println(gradChar(80.0));		//우
		System.out.println(gradChar(50.0));		//가
		
		showStar(5);
		
	}

}
