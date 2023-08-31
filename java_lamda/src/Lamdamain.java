import java.util.Random;

interface Printable {
	void print(String s);
}

//class Printer implements Printable {
//	public void print(String s) {
//		System.out.println(s);
//	}
//}

@FunctionalInterface
interface Calculate {
	int cal(int a, int b);
}

@FunctionalInterface
interface HowLong {
	int len(String s);
}

@FunctionalInterface
interface Generator {
	int rand();	//매개변수 없음
}

public class Lamdamain {
	public static void main(String[] args) {
		
		Generator gen = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		System.out.println(gen.rand());
		
		
//////////////////////////////////////////////		

		
//		HowLong h = (s) -> {return s.length();};
		HowLong h = s -> s.length();
		
		System.out.println(h.len("안녕하세요"));
		
		
//////////////////////////////////////////////		

		Calculate calc;
		calc = (a,b) -> {return a+b;};
		
		System.out.println(calc.cal(4, 3));
		
		calc = (a,b) -> {return a-b;};
		
		System.out.println(calc.cal(4, 3));
		
//////////////////////////////////////////////		
		
		
//		Printable prn = new Printer();
//		prn.print("람다가 뭐야?");
		
		Printable prn = new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		
		prn.print("안녕");
		
		Printable prn1 = (s) -> { System.out.println(s);};

		prn.print("드디어람다");
	}
}