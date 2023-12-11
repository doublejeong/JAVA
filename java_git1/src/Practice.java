
public class Practice {

	public static void main(String[] args) {

		double area = getCircleArea(10);
		System.out.println(area);
		
		area = getRectangleArea(10,20);
		System.out.println(area);

		area = getTriangleArea(40,20);
		System.out.println(area);

		int code = getAscCode('A');
		System.out.println(code);
		code = getAscCode(' ');
		System.out.println(code);
		code = getAscCode('\n');
		
		divide(5, 6);
		
	}
	
	public static void divide (double num1, double num2) {
		if (num2 == 0) {
			return;
		} else {
			System.out.println("나눗셈의 결과: " + (num1/num2));
		}
	}
	
	public static double getCircleArea(double radius) {
		final double PI = 3.14;
		
		return radius * radius * PI;
	}
	
	public static double getRectangleArea(double width, double height) {
		
		return width * height;
	}

	public static double getTriangleArea(double width, double height) {
		
		return width * height / 2;
	}
	
	public static int getAscCode(char ch) {
		return (int)ch;
	}
	
	
	
	
}