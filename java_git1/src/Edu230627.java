//		polymorphysm = 다형성

class AA {
	
	public void aa() {
		System.out.println("aa 함수 입니다.");
	}
	
}

class BB extends AA {
	
	public void bb() {
		System.out.println("bb 함수 입니다.");
	}
	
}

///////////////////////////////////////////////////

// 메소드 오버라이딩 = 상속관계에서 똑같은 함수이름(이름, 리턴타입, 파라미터갯수와 종류)로 바디{}(실행내용)만 달리 하는것
class Cake {
	public void yummy() {
		System.out.println("Yummy cake");
	}
}

class CheeseCake extends Cake {
	// Cake의 yummy메소드를 오버라이딩 함
	public void yummy() {
		System.out.println("Yummy Cheese cake");
	}
}

///////////////////////////////////////////////////

//다형성 + 오버라이딩 = 응용

class Robot {
	public void work() {
		
	}
}

class DanceRobot extends Robot {
	public void work() {
		System.out.println("춤추는 로봇");
	}
}

class DrawRobot extends Robot{
	public void work() {
		System.out.println("그림을 그리는 로봇");
	}
}

class WashRobot extends Robot{
	public void work() {
		System.out.println("세탁하는 로봇");
	}
}

///////////////////////////////////////////////////


class pritable1 {
	public void pront(String doc) {
		
	}
}

// 인터페이스 안에 올수 있는 것은 함수구현(X) -> 추상메서드와 상수만 올 수 있음
// 인터페이스 자손이 구현하라.

//인터페이스를 사용하는 이유
//1. 선배들이 사용하기 때문에 (표준 = 강제 = 규약 = 프린트 드라이버)
//2. 다중 상속지원
interface Printable {
	abstract public void print(String doc);	//	함수선언 = 함수 정의 = abstract = 추상메서드
}
interface Movable {
	abstract public void move();	//	함수선언 = 함수 정의 = abstract = 추상메서드
}

class Printer implements Printable,Movable {

	@Override
	public void print(String doc) {

		System.out.println(doc);
	}

	@Override
	public void move() {
		System.out.println("움직입니다");
	}
	
}


///////////////////////////////////////////////////

class SamsungPrinter {
	public void printSamsung(String doc) {
		System.out.println(doc + "프린트 되었습니다.");
	}
}
class LGPrinter {
	public void printLG(String doc) {
		System.out.println(doc + "프린트 되었습니다.");
	}
}

///////////////////////////////////////////////////

//마이크로 소프트라는 회사가 인터페이스를 만듦(강제)
interface Printable0 {
	abstract public void print(String doc);
}


//삼성개발자가 만듬
class SPrinterDriver implements Printable0 {
	
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

//LG개발자가 만듬
class LGPrinterDriver implements Printable0 {
	
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

///////////////////////////////////////////////////

//협업 = 외주
interface ICalculator {
	abstract public int add(int num1, int num2);
	abstract public int sub(int num1, int num2);
	abstract public int mul(int num1, int num2);
	abstract public int div(int num1, int num2);
}

class Calcul implements ICalculator {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 ==0 ) {
			return 0;
		}
		return num1 / num2;
	}
	
	
}

public class Edu230627 {

	public static void main(String[] args) {

		AA aa = new AA();
		System.out.println(aa);
		
		BB bb = new BB();
		System.out.println(bb);
		
		bb.aa();

		AA aaa = new BB();	//에러 안남
//		BB bbb = new AA();	//에러 발생
		
		aaa.aa();
//		aaa.bb();	//에러
		
		
/////////////////////////////////////////////////////
		
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();
		
///////////////////////////////////////////////////

		
		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()};
		
		for(Robot robot : arrRobot) {
			robot.work();
		}
		
		
///////////////////////////////////////////////////

		Printer printer = new Printer(); //인터페이스도 다형성이 적용됨
		printer.move();
		printer.print("안녕하세요");
		
///////////////////////////////////////////////////

		SamsungPrinter samsung = new SamsungPrinter();
		samsung.printSamsung("안녕하세요~");

		LGPrinter LG = new LGPrinter();
		LG.printLG("안녕하세요.");
		
///////////////////////////////////////////////////

		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable0 prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LGPrinterDriver();
		prn.print(myDoc);
		
///////////////////////////////////////////////////
		
		ICalculator calcul = new Calcul();
		System.out.println(calcul.add(7, 7));
		System.out.println(calcul.sub(10, 7));
		System.out.println(calcul.mul(7, 7));
		System.out.println(calcul.div(7, 7));
		
		
	}

}
