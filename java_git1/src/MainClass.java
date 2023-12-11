import com.sun.jdi.VoidType;

// Object Oriented Programing (객체지향언어) = 자바
class Student {
	int age;
	char gender = 'M';
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}

class Circle{
	double radius;
//	final double PI = 3.14;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
		
	}
	
}

class Rectangle2 {
	double width, height;
	
	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
	
}

class StarPrint{
	
	void printTriangle(int num) {
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	void printReverseTriangle(int num) {
		for (int i = 1; i <= num; i++) {
		    for (int j = i; j <= num; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
	}
	
}

class GetSum {
	int num;

	void setNum(int num1) {
		num = num1;
	}

	int sum() {

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		return sum;
	}
}


class  Gugudan {
	void printGugu(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
}

class Grade {
	double kor, eng, math;
	double avg;
	char grade;
	
	void setGrade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	double getAvg() {
		avg =(kor + eng + math) / 3;
		return avg;
	}
	char getGrade() {
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		return grade;
	}
	
}



// 클래스와 객체(=인스턴스)의 차이
public class MainClass {

	public static void main(String[] args) {

		
		
		
		//////////////////////////
		Grade grade = new Grade();
		grade.setGrade(90.2, 80.3, 70.5);
		grade.getAvg();
		System.out.println(grade.getGrade());
		
		
//////////////////////////////////	

		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10);	//1단부터 10단까지 출력
		gugudan.printGugu(20);	//1단부터 20단까지 출력
		
/////////////////////////////////
		
		GetSum getsum = new GetSum();
		getsum.setNum(3);
//		?
		
		
		
		/////////////////////////
		
		StarPrint strPrint = new StarPrint();
		strPrint.printTriangle(3);
		
		System.out.println();////////////////////
		
		StarPrint strRePrint = new StarPrint();
		strRePrint.printReverseTriangle(5);
		
		//////////////////////////////////////
		
		Rectangle2 rec = new Rectangle2();
		rec.setWidthHeight(10, 5);
		
		System.out.println(rec);
		System.out.println(rec.getArea());
		
		Rectangle2 rec2 = new Rectangle2();
		rec2.setWidthHeight(10, 10);
		
		System.out.println(rec2.getArea());
		
		
		///////////////////////////////////
		int num = 0;
		
		Circle circle = new Circle();
		circle.setRadius(10);
		
		double area = circle.getArea();
		
		System.out.println(area);
		
		
		
		Student 백지효 = new Student();		//객체(인스턴스)
		Student 김민성 = new Student();		//객체(인스턴스)
		
		백지효.setAge(40);
		백지효.setGender('M');
		
		char gender = 백지효.getGender();
		System.out.println(gender);
		
		int age = 백지효.getAge();
		System.out.println(age);
		

		백지효.age = 30;
		김민성.age = 25;
		
		System.out.println(백지효.age);

//		Rectangle rec = new Rectangle();
//		
//		rec.width = 3;
//		rec.height = 5;
//		
//		System.out.println(rec.width);
//		System.out.println(rec.height);
		
	}

}
