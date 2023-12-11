import java.util.Scanner;

//class Grade3 {
//	private double kor, eng, math; //인스턴트 변수
//	private String name;
//	
//	public void setGrade(String name,double kor, double eng, double math) { 
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math; 
//	}
//   
//	public void showInfo() {
//		System.out.println(name + " 님의 평균은 " + getAvg() + "성적은 " + getGrade() +"입니다");
//		return;
//	}
//
//	public double getAvg() { 
//		return (kor + eng + math) / 3.0;
//	}
//
//	public char getGrade() {
//		char ch = '가';
//		double avg = getAvg(); 
//      
//		if(avg >=90) {
//			ch='수';
//		} else if (avg >=80) {
//			ch='우';
//		} else if (avg >=70) {
//			ch='미';
//		} else if (avg >=60) {
//			ch='양';
//		} else {
//    	 ch='가';
//		}
//		return ch;
//   }
//}

public class NotePad3 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		Grade3 grade;
//		String choice = "y";
//		
//		while (true) {
//			System.out.print("Name:");
//			String name = sc.next();
//			
//			System.out.print("국어");
//			double kor = sc.nextDouble();
//			
//			System.out.print("영어");
//			double eng = sc.nextDouble();
//			
//			System.out.print("수학");
//			double math = sc.nextDouble();
//			
//			grade = new Grade3();
//			grade.setGrade(name, kor, eng, math);
//			
//			grade.showInfo();
//			
//			System.out.println("계속하시겠습니까 (y,n)");
//			choice = sc.next();
//			
//			if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0) {
//				
//			} else {
//				System.out.println("끝");
//				break;
//			}
//		}
		int length, Acount, Bcount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 단어를 입력하세요.");
		String word = sc.nextLine();
		
		length = word.length();
//		for (int i = 0; i < ; i++) {
//			
//		}
		
		
		System.out.println(length);
//		System.out.println(Acount);
		
	}
}
