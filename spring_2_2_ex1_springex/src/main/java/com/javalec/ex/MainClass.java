package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class Heart {
	
}
//
//class Computer{
//	Cpu cpu = new Cpu();
//	
//	Computer(Cpu cpu){
//		
//	}
//	
//}
//
//class Cpu {
//	Chip chip = new Chip();
//	Cpu(Chip chip){
//		
//	}
//	
//}
//
//class Chip {
//	
//}

//1. 다이렉트 객체 생성 = 완제품
//2. 함수를 통해서 = 조립품
//class Person {
//	Heart heart ;//= new Heart();
//
//	Person(Heart heart){
//		this.heart = heart;
//	}
//	
//	void setHeart(Heart heart) {
//		this.heart = heart;
//	}
//	
//}

public class MainClass {

	public static void main(String[] args) {
		
		//객체 호출순서
		// Computer() => Cpu() => Chip()
		
//		Computer computer = new Computer();
//		
//		
//		// Chip() => Cpu() => Computer()
//		Intel intel;
//		Amd amd;
//		
//		Computer computer = (new Cpu(new Chip()));
//		
//		
//		Person person = new Person(new Heart());
		
		
		
		Calculation calculation = new Calculation();
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.addition();
		calculation.subtraction();
		calculation.multiplication();
		calculation.division();
		
		System.out.println("======================");
		
//		Circle circle = new Circle(10);
//		System.out.println("넓이 " + circle.getArea());
		
		String config = "classpath:appCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		Circle circle = (Circle) ctx.getBean("circle");
		System.out.println("넓이 " + circle.getArea());

		circle = (Circle) ctx.getBean("circle2");
		System.out.println("넓이 " + circle.getArea());
		
		circle = (Circle) ctx.getBean("circle3");
		System.out.println("넓이 " + circle.getArea());
		
		
		Student student = (Student) ctx.getBean("student1");
		
		System.out.println(student.getAge());
		System.out.println(student.getName());
		
		student.setAge("20살");
		student.setName("홍길순");
	
		System.out.println(student.getAge());
		System.out.println(student.getName());
		
	}
	
}
