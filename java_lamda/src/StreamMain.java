import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

class ToyPriceInfo { // 장난감 모델 별 가격 정보
	private String model; // 모델 명
	private int price; // 가격
	
	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}
	
	public int getPrice() {
		return price;
	}
}


class Product {
   private String name;
   private int number;

   public Product(int number, String name) {
      this.number = number;
      this. name =  name;
      
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

}

public class StreamMain {
	

	public static void main(String[] args) {

		// 배열 내에 있는 수들의ㅐ 합을 구하시오.
		
		int[] arr = {1,2,3,4,5};
		
		int sum=0;
		
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		
		//데이타 {1,2,3,4,5}
//		IntStream stm1 = Arrays.stream(arr);
//		IntStream stm2 = stm1.filter((n)-> n%2 ==1);
//		sum = stm2.sum();

		sum = Arrays.stream(arr)
		.filter((n)-> n%2 ==1)
		.sum();
		
		System.out.println(sum);
		
		
		String[] names = {"yoon","park","lee"};
		
		Arrays.stream(names).forEach(s -> System.out.println(s));
		// 이렇게 생략도 가능
		Arrays.stream(names).forEach(System.out::println);

		
		
		Arrays.stream(names)
			  .filter(s -> s.length() != 3)
			  .forEach(System.out::println);

		System.out.println("-----------------------------");

		List<String> ls = Arrays.asList("Box","Robot","Simple");
		
		ls.stream()
			.map(s -> s.length())
			.forEach(System.out::println);
		
		
		List<ToyPriceInfo> ls1 = new ArrayList<>();
		ls1.add(new ToyPriceInfo("GUN_LR_45", 200));
		ls1.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
		ls1.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 550));

		sum = ls1.stream().filter(p -> p.getPrice() < 500).mapToInt(t -> t.getPrice()).sum();

		System.out.println(sum);
		
		
		
		System.out.println("======================");
		///////////// 230905
		
		List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		
		Stream<Integer> stream1 = list.stream().distinct();
		stream1.forEach(System.out::println);
		
		list.stream()
			.distinct()
			.forEach(System.out::println);
		
		
		List<String> list2 = Arrays.asList("자바", "코틀린", "스칼라");
		
//		Stream<Integer> stream2 = list2.stream().map(s -> s.length()); 			//이것도 되고 밑에것도 됨 (똑같음)
		Stream<Integer> stream2 = list2.stream().map(String::length);
		stream2.forEach(System.out::println);
		
		
		
		sum = list2.stream()
				   .mapToInt(String::length)
				   .sum();
		
		System.out.println(sum);
		
		
		// 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어 주는 역할
		
		List<List<Integer>> list3 = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(4, 2)); 
		// [[1,3],[4,2]] -> 백터
		// [1,3,4,2] -> 스칼라

		List<Integer> list4 =
				list3.stream()
					 .flatMap(Collection::stream)
					 .collect(Collectors.toList());	// Stream 객체를 -> 셋리큐맵 으로 바꿀때
		
		for (Integer i : list4) {
			System.out.println(i);
		}
		
		list4.stream().forEach(System.out::println);
		
		
		System.out.println("================");
		// 1부터 10까지의 합
		IntStream.range(0, 10).forEach(System.out::println);
		
		sum = IntStream.range(0, 11).sum();
		System.out.println(sum);
		
		// limit ~5 까지
		IntStream.range(0, 10).limit(5).forEach(System.out::println);

		// [3,4,5,6,7,8,9] 	[0,1,2]
		IntStream.range(0, 10).skip(3).forEach(System.out::println);
		
		
		System.out.println("=======abc순으로 정렬=========");
		List<String> list6 = Arrays.asList("Java", "C", "Python", "Kotlin", "Scala", "Go");
		
		list6 = list6.stream().sorted().collect(Collectors.toList());
		list6.stream().forEach(System.out::println);

		System.out.println("=======역으로 정렬=========");
		list6 = list6.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		list6.stream().forEach(System.out::println);
				
		System.out.println("=======글자수로 정렬=========");
		list6 = list6.stream()
					 .sorted(Comparator.comparingInt(String::length))
					 .collect(Collectors.toList());
		
		list6.stream().forEach(System.out::println);
		
		System.out.println("=======디버깅 용=========");
		
		IntStream stream = IntStream.range(0, 10);
//		이 메소드는 원본 스트림에서 요소를 소모하지 않으므로, 주로 연산과 연산사이에 결과를 확인하기 위해 사용된다.
//		(디버깅 용도로 많이 사용한다.)
		stream.peek(System.out::print)    // 0123456789
		   	  .sum(); 
		
		System.out.println(sum);
		
		
		System.out.println("====================");
		sum = IntStream.range(0, 101).sum();
		System.out.println(sum);

		System.out.println("====================");
		sum = IntStream.range(0, 101).sum();
		System.out.println(sum);
		
		System.out.println("====================");
		long count = DoubleStream.of(1.1, 2.2, 3.3).count();
		System.out.println(count);
		
		System.out.println("====================");
		DoubleStream.of(1.1, 2.2, 3.3)
					.average()
					.ifPresent(System.out::println);
		
		System.out.println("====================");
		
		List<Product> productList = Arrays.asList(
				new Product(23, "potatoes"),
                new Product(14, "orange"),
            	new Product(13, "lemon"),
            	new Product(23, "bread"),
            	new Product(13, "sugar"));
		
//		List<String> nameList = productList.stream().map(p -> p.getName()).collect(Collectors.toList());	//같다.
		List<String> nameList = productList.stream()
									       .map(Product::getName)
									       .collect(Collectors.toList());
		
		nameList.stream().forEach(System.out::println);
		
	}

}