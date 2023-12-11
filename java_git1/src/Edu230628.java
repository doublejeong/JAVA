import java.util.Scanner;

//	추상 클래스와 인터페이스의 차이


//	interface = abstract = 자식이 구현하라.
abstract class House {
	abstract public void build2();
	int a = 10;
	public void build() {
		System.out.println("집을 짓습니다.");
	}
}

class House2 extends House {

	@Override
	public void build2() {
		System.out.println("집을 짓습니다.2");
	}
	
}

//------------------------------------------	

abstract class Calc{
    protected int a;
    protected int b;
    void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    	}
    abstract int calculate();
}

class Add extends Calc{

	@Override
	int calculate() {
		return a + b;
	}
}

class Sub extends Calc{
	
	@Override
	int calculate() {
		return a - b;
	}
}

class Mul extends Calc{
	
	@Override
	int calculate() {
		return a * b;
	}
}

class Div extends Calc{
	
	@Override
	int calculate() {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
}

//------------------------------------------	

class AAA {
	
	@Override
	public String toString() {
		return "이것도 메롱이다";
	}
	
}


class Circle55 {
	private int radius;
	
	public Circle55(int rad) {
		radius = rad;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public String toString() {
		return "원의 넓이는" + getArea() + "이고 반지름은" + radius + "인원";
	}
	
}

//------------------------------------------

class Member {
String color;
	public Member(String color) {

		this.color = color;
	}

	public String toString() {
		return color;
		
	}
	// 애너테이션은 기본적으로 일정한 기능을 가진 함수
	@Override	//부모에 해당 함수 있어야 한다.
	public boolean equals(Object obj) {
		
		Member mem = (Member)obj;
		
		if (this.color.equals(mem.color)) {
			
			return true;
		}
		return false;
		
	}
}

//------------------------------------------

class Rectangle55 {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "가로:" + width + "세로:" + height;
	}

	// int num = (int) 3.14
	@Override
	public boolean equals(Object obj) {

		Rectangle55 rec = (Rectangle55) obj; // 자식 = 부모 되는 케이스트 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함

		if ((this.width == rec.width) && (this.height == rec.height))
			return true;

		return false;
	}

}


class Person {
String name;
int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		
		if (this.name.equals(person.name) && (this.age == person.age)) {
			
			return true;
		}
		return false;
		
	}
	
}


public class Edu230628 {

	public static void main(String[] args) {

		House house = new House2();
		
//		------------------------------------------		
		
		
//        Scanner sc = new Scanner(System.in);
//        System.out.print("두 정수와 연산자를 입력하시오>> ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        char c = sc.next().charAt(0);
//
//        if(c == '+'){
//            Add add = new Add();
//            add.setValue(a, b);
//            System.out.println(add.calculate());
//        }
//        else if(c == '-'){
//            Sub sub = new Sub();
//            sub.setValue(a, b);
//            System.out.println(sub.calculate());
//        }
//        else if(c == '*'){
//            Mul mul = new Mul();
//            mul.setValue(a, b);
//            System.out.println(mul.calculate());
//        }
//        else if(c == '/'){
//            Div div = new Div();
//            div.setValue(a, b);
//            System.out.println(div.calculate());
//        }
//	
	
	//------------------------------------------	

        String str = new String("메롱");
        System.out.println(str);
        
        AAA aaa = new AAA();	// null 이 아니면 부모(Object)에 있는 toString 호출
        System.out.println(aaa);
        

        AAA bbb = new AAA();
        boolean b = aaa.equals(bbb);
        System.out.println(b);

        String str1 = new String("메롱");
		String str2 = new String("메롱");
		boolean bt = str1.equals(str2);
		System.out.println(bt);
		
		
		Circle55 circle = new Circle55(10);
		System.out.println(circle); 	// 원의 넓이는 314.1592 이고 반지름 10인 원
		
		
		//------------------------------------------	

		Member obj1 = new Member("Black");
		Member obj2 = new Member("Black");
		Member obj3 = new Member("White");

		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3)); // false가 출력
		
		//------------------------------------------
		
//		Rectangle55 rec = new Rectangle55();
//		Rectangle55 rec2 = new Rectangle55();
//
//		boolean b = rec.equals(rec2);
		
		//------------------------------------------
		
		Person kim = new Person("홍길동" ,35);
		Person park = new Person("홍길동" ,35);
		Person heo = new Person("홍길동" ,34);
		
		if (kim.equals(park))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");

		if (kim.equals(heo))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");
		
//		------------------------------------------
//		에러처리 /예외처리
//		2가지 방법
//		1. try catch finally
//		2. throws
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			int num = sc.nextInt();
			System.out.println(num);

//			System.out.println(3/0);
			
		} catch (Exception e) {
			System.out.println("캐취안 입니다.");
		} finally {
			System.out.println("파이널리 입니다.");
			
		}
		System.out.println("프로그램 종료입니다.");
		
		
	}

}
