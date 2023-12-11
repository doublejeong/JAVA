import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Box<T >{//extends Number> {
	
	private T ob;
	
	public void set(T o) {
		ob = o;
		
	}

	public T get() {
		return ob;
	}
}


class Apple {
	public String toString() {

		return "I'm apple";
	}
}

class Orange {
	public String toString() {

		return "I'm Orange";
	}
}
	
	
///////////////////////////////////////////
	
	
////지네릭 문법 = 데이터 타입을 파라미터화 시킴	
//class DBox<L,R> {
//	private L left;		//왼쪽 수납 공간
//	private R right;		//오른쪽 수납 공간
//	
//	public void set(L o, R r) {
//		left = o;
//		right = r;
//	}
//	
//	@Override
//	public String toString() {
//		return left + " & " + right;
//	}
//}

///////////////////////////////////////////

class BoxFactory {
	public static <T> Box<T> makeBox(T o){
		Box<T> Box = new Box<T>();		//상자를 생성하고,
		Box.set(o);		//전달된 인스턴스를 상자에 담아서,
		return Box;		//상자를 반환한다
	}
}

///////////////////////////////////////////

class MyLinkedList {
	int num;
	
	MyLinkedList myLinkedList;
	
}



///////////////////////////////////////////



public class Edu230630 {

	public static void main(String[] args) {
		
//		Box<Apple> aBox = new Box<Apple>();		//T를 Apple로 결정
//		Box<Orange> oBox = new Box<Orange>();		//T를 Orange로 결정
//
//		aBox.set(new Apple()); 		//사과를 상자에 담는다.
//		oBox.set(new Orange()); 		//오렌지를 상자에 담는다.
//	
//		Apple ap = aBox.get();		//사과를 꺼내는데 형 변환 하지 않는다.
//		Orange og = oBox.get();		//오렌지를 꺼내는데 형 변환 하지 않는다.
//		
//		System.out.println(ap);
//		System.out.println(og);
		
		
/////////////////////////////////
		
//		DBox<String, Integer> box = new DBox<String, Integer>();
//		DBox<Apple, Orange> box1 = new DBox<>();	//참조변수 선언을 통해서 컴파일러가 사이에 Apple,Orange이 와야함을 유추한다.
//		
//		box.set("Apple",25);
//		System.out.println(box);
//		
//		box1.set(new Apple(), new Orange());
//		System.out.println(box1);
		
/////////////////////////////////
		
//		Box<Integer> iBox = new Box<>();
//		iBox.set(24);
//
//		Box<Double> dBox = new Box<>();
//		dBox.set(5.97);
//		
//		System.out.println(iBox.get());
//		System.out.println(dBox.get());
		
/////////////////////////////////
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
		System.out.println(dBox.get());
		
/////////////////////////////////		
		
		
		Box<Integer> box1 = new Box<>();
		box1.set(99); // 오토 박싱

		Box<Integer> box2 = new Box<>();
		box2.set(55); // 오토 박싱

		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());
		
/////////////////////////////////		

		List<String> list = new LinkedList<>();		//유일한 변화!!!
		
		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		// 저장된 문자열 인스턴스의 참조
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		
		for (String str : list) {
			System.out.print(str + '\t');
		}
		System.out.println();
		
		
		list.remove(0);		//첫 번째 인스턴스 삭제
		
		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		
/////////////////////////////////

		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		
		MyLinkedList my2 = new MyLinkedList();
		my1.num = 11;
		
		my1.myLinkedList = my2;
		
		my2.myLinkedList = new MyLinkedList();
		
		
		
	}

	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		T temp = box1.get();	//box1의 값을 임시 변수에 저장
		box1.set(box2.get());	//box1에 box2의 값을 설정
		box2.set(temp);			//box2에 임시 변수의 값을 설정
	}

}
