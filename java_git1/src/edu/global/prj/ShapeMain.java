package edu.global.prj;

import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Shape;
import edu.global.prj.shape.Rectangle;

class Price {
	private double price = 0;
	Price(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}

class Computer extends Price {
	public Computer(double price) {
		super(price);
	}
}

class Speaker extends Price {
	public Speaker(double price) {
		super(price);
	}
}


public class ShapeMain {
	
	public static void checkPrice(Price price) {
		System.out.println(price.getPrice());
	}

	public static void main(String[] args) {

		Computer computer = new Computer(100);
		Speaker speaker = new Speaker(50);
		
		checkPrice(computer);
		checkPrice(speaker);
		
		
		
		Shape[] shape = {new Circle(10), new Rectangle(10,20)};
		
		//
		double area = 0;
		
		for(Shape s : shape) {
			area = area + s.getArea();
		}
		
		System.out.println(area);
		
		//폴리몰피즘과 오버라이딩을 적용안하면
//		Circle c1 = new Circle(10);
//		Rectangle rec1 = new Rectangle(10);
//		area = c1.getArea() +rec1.getArea();
		
	}

}
