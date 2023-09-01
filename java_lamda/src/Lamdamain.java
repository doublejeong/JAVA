import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface // 두 개가 못들어 가게 하는 에너테이션
interface Printable {
   void print(String s);
}

@FunctionalInterface
interface Calculate{
	int cal(int a, int b);
}

@FunctionalInterface
interface HowLong{
	int len(String s);
}

@FunctionalInterface
interface Generator{
	int rand(); // 매개 변수 없음 ! 
	
}
//class Printer implements Printable {
//   public void print(String s) {
//      System.out.println(s);
//   }
//}



public class Lamdamain {
	
	
	public static int sum(Predicate<Integer> p,List<Integer> list) {
		int s =0;
		for(int n : list) {
			if(p.test(n))
				s += n;
			
		}
		return s;
	}
	
	public static List<Integer> makeIntList(Supplier<Integer> s, int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(s.get()); // 난수를 생성해 담는다.
		return list;
	}

	public static void main(String[] args) {

		Consumer<String> c1 = str -> System.out.println(str);
		
		c1.accept("안녕하세요");
		c1.accept("컨쥬머");
		
		Function<String, Integer> fun = s -> s.length();
		
		System.out.println(fun.apply("안녕하세용"));
		System.out.println(fun.apply("안녕"));
		System.out.println(fun.apply("안녕하용"));
		System.out.println(fun.apply("안녕하세"));
		
		/////////////////////////////////////

		Supplier<Integer> spr = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};

		List<Integer> list = makeIntList(spr, 5);
		System.out.println(list);

		list = makeIntList(spr, 10);
		System.out.println(list);
		
	   
       /////////////////////////////////////
	   
//	   List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
//	   int s;
//	   
//	   s = sum(n-> n%2 == 0, list);
//	   System.out.println("짝수 합 : " + s);
//	   
//	   s = sum(n-> n%2 != 0, list);
//	   System.out.println("수 합 : " + s);
	   
	   
	   /////////////////////////////////////
	   Calculate calc;
	   
	   calc = (a,b) -> {return a+b;};
	   
	   System.out.println(calc.cal(4, 3));
	   
	   ////////////////////////////////////
	   
//	   HowLong h = s -> s.length();
//	   System.out.println(h.len("안녕하세요."));
	   
	   ///////////////////////////////////
	   Generator gen = () -> {
		   Random rand = new Random();
		   return rand.nextInt(50);
	   }; // 파라미터가 없으면 ()로 해도 됨 
	   System.out.println(gen.rand());
	   
	
   
//      Printable prn = new Printer(); 기존에 쓰던 방식, 구현부따로만들어서 부모=자식 해서 프린트함
//      prn.print("람다가 뭐야");
      
   
	  // 인터페이스로 생성자 만들어줌 =익명클래스
      Printable prn = new Printable() { 
         
         @Override
         public void print(String s) {  //구현부를 오버라이드
            System.out.println(s);
         }
      };
      
      prn.print("안농");
      
      // 람다 
//      Printable prn1 = (s) -> {System.out.println(s);};
//      
//      prn1.print("드디어 람다.");
      
   
   }

}