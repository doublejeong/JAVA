import java.util.Scanner;

class Circle2 {
	private double radius; // 변수선언 > 게터세터 넣기

	public Circle2() {
	}

	public Circle2(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius; // 원의 넓이를 가져오는 함수
	}

	public void setRadius(double radius) { // 외부값받아서 원의넓이를 변경하는 함수
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI; // 원의 넓이 곱하는 함수만듦
	}

}

class Rectangle11 {
double width,height,sum;
	public Rectangle11(double width, double height) {
		this.height=height;
		this.width=width;
	}

	public double getArea() {
		sum = width * height;
		return sum;
	}
	
}



class Grade2 {
	private double kor, eng, math; //인스턴트 변수
	private String name;
	
   public void setGrade(String name,double kor, double eng, double math) { 
      this.name = name;
	   this.kor = kor;
      this.eng = eng;
      this.math = math; 
   }
   
   public void showInfo() {
	   System.out.println(name + " 님의 평균은 " + getAvg() + "성적은 " + getGrade() +"입니다");
	   return;
   }

   public double getAvg() { 
      return (kor + eng + math) / 3.0;
   }

   public char getGrade() {
      char ch = '가';
      double avg = getAvg(); 
      
      if(avg >=90) {
         ch='수';
      }
      else if (avg >=80) {
         ch='우';
      }
      else if (avg >=70) {
         ch='미';
      }
      else if (avg >=60) {
         ch='양';
      } else {
    	 ch='가';
      }
      
      return ch;
   }
}


public class CircleMain {

	private static final String pattern = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Circle2 circle;
//
//		System.out.print("반지름:");
//		double radius = sc.nextDouble();
//
//		circle = new Circle2(radius);
//
//		System.out.println("넓이는:" + circle.getArea());
		
		//////////////////////
		
//		Rectangle11 rectangle;
//		for (int i = 0; i < 2; i++) {
//			System.out.print("가로:");
//			double width = sc.nextDouble();
//			
//			System.out.print("세로:");
//			double height = sc.nextDouble();
//			
//			rectangle = new Rectangle11(width,height);
//			
//			System.out.println("넓이는:"+rectangle.getArea());
//			
//			System.out.println("계속하시겠습니까? (y,n)");
//			String question = sc.next();
//			
//			if (question.equals("y")) {
//				i = 0;
//				
//			} else if (question.equals("n")) {
//				i++;
//				System.out.println("종료되었습니다.");				
//			} else {
//				i++;
//				System.out.println("잘못입력하였습니다. 프로그램이 종료되었습니다.");
//			}
//		}

		Grade2 grade;
		String choice = "y";
		
		while (true) {
			
			System.out.print("Name:");
			String name = sc.next();
			
			System.out.print("국어");
			double kor = sc.nextDouble();
			
			System.out.print("영어");
			double eng = sc.nextDouble();
			
			System.out.print("수학");
			double math = sc.nextDouble();
			
			grade = new Grade2();
			grade.setGrade(name, kor, eng, math);
			
			
			grade.showInfo();
			
			System.out.println("계속하시겠습니까 (y,n)");
			choice = sc.next();
			
			if (choice.equals("y")) {
				
			} else {
				System.out.println("끝");
				break;
			}
		}
		
		
		
	}

}
