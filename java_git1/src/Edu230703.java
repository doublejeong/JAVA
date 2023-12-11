import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class Circle3 {
	private int radius;
	
	public Circle3(int rad) {
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

class Num {
	private int num;
	public Num(int n ) {
		num = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3;		//num의 값이 같으면 부류도 같다.
	}
	
	@Override
	public boolean equals(Object obj) { // num의 값이 같으면 true 반환
		if (num == ((Num) obj).num) {
			return true;
		} else {
			return false;
		}
	}

}

/////////////////////////////////////////////////

class Person2 {
	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return  age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}

	@Override
	public boolean equals(Object obj) { 
		if (age == ((Person2) obj).age && name == ((Person2)obj).name) {
			return true;
		} else {
			return false;
		}
	}
}


public class Edu230703 {

	public static void main(String[] args) {

		//1부터 10까지 (List에 넣어서)의 합을 구하시오.
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		
		int sum = 0;
		for (Integer num : list) {
			sum = num + sum;
		}
		System.out.println(sum);
		
		
		///////////////////////////////////////////
		// 글자의 총 갯수를 구하시오.
		
		List<String> textList = new ArrayList<>();
		
		textList.add("Spring");
		textList.add("summer");
		textList.add("fall");
		textList.add("winter");
		
		int sum2 = 0;
		for (int i = 0; i < textList.size(); i++) {
			String count = textList.get(i);
			
			sum2 = sum2 + count.length();
		}
		System.out.println(sum2);
		
		
		///////////////////////////////////////////
		// 반지름이 각각 10,20,30 를 List에 넣어서 총 넓이를 구하시오.
		
		List<Integer> circleList = new ArrayList<>();
		circleList.add(10);
		circleList.add(20);
		circleList.add(30);
		
		double toCircle = 0;
		
		for (int i = 0; i < circleList.size(); i++) {
			int circle1 = circleList.get(i);
			
			toCircle = circle1 * circle1 * Math.PI;
			
			System.out.println("반지름 " + circleList.get(i) + "의 총 넓이는 " + toCircle);
		}
		
		////////////////////////////////////////////
		
		List<Circle3> circleList2 = new LinkedList<>();
		
		for (int i = 1; i <= 10; i++) {
			circleList2.add(new Circle3(i));
		}
		
		double sum3 = 0;
		for (Circle3 circle3: circleList2) {
			sum3 += circle3.getArea();
			System.out.println(sum3);
		}
		
		
		////////////////////////////////////////////

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(10);		//저장 과정에서 오토 박싱 진행
		list2.add(20);
		list2.add(30);
		
		int n;
		
		for (Iterator<Integer> itr = list2.iterator(); itr.hasNext();) {
			n = itr.next();		//오토 언박싱 진행
			System.out.print(n + "\t");
		}
		System.out.println();
		
		////////////////////////////////////////////

		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("인스턴스 수: " + set.size());
		
		// 반복자를 이용한 전체 출력
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
		
		//for-each문을 이용한 전체 출력
		for(String s :set) {
			System.out.print(s + '\t');
		}
		System.out.println();
		

		////////////////////////////////////////////

		Set<Num> set1 = new HashSet<>();
		
		set1.add(new Num(3));
		set1.add(new Num(3));
		set1.add(new Num(2));
		set1.add(new Num(10));

		System.out.println(set1.size());
		
		/////////////////////////////////////////////
		
		HashSet<Person2> hSet = new HashSet<Person2>();
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("PARK", 35));
		hSet.add(new Person2("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
		
		/////////////////////////////////////////////
//		Set 이용해서 로또 만들기

		Set<Integer> lotto = new HashSet<>();

		while(lotto.size() != 6) {
			int num = (int)(Math.random() * 45 + 1);
			lotto.add(num);
		}

		System.out.println(lotto);
		
		/////////////////////////////////////////////
		// TreeSet
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		System.out.println("인스턴스 수: " + tree.size());
		
		//for-each문에 의한 반복
		for(Integer n1 : tree) {
			System.out.print(n1.toString() + '\t');
		}
		System.out.println();
		
		//Iterator 반복자에 의한 반복
		for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + '\t');
		}
		System.out.println();
		
		/////////////////////////////////////////////
		// 큐의 구현
		
		Queue<String> que = new LinkedList<>(); 	//LinkedList<E> 인스턴스 생성!
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");

		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());
		
		// 첫번째, 두번째 인스턴스 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());

		// 무엇이 다음에 나올지 확인
		System.out.println("next: " + que.peek());

		// 마지막 인스턴스 꺼내기
		System.out.println(que.poll());
		
		/////////////////////////////////////////////

		
	}

}
