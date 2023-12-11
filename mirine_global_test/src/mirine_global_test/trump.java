package mirine_global_test;

import java.util.ArrayList;
import java.util.List;

public class trump {

	public static void main(String[] args) {

		List<Integer> trump = new ArrayList<>();
		trump.add(2);
		trump.add(3);
		trump.add(4);
		trump.add(5);
		trump.add(6);
		trump.add(7);
		trump.add(8);
		trump.add(9);
		trump.add(10);
		trump.add(11);
		trump.add(12);
		trump.add(13);
		trump.add(1);

		int a = (int) (Math.random() * 13) + 1;
		int b = (int) (Math.random() * 13) + 1;
		System.out.println("a: " + a + ", b: " + b);
		if (trump.indexOf(a) > trump.indexOf(b)) {
			System.out.println("A 승");
		} else if (trump.indexOf(a) < trump.indexOf(b)) {
			System.out.println("B 승");
		} else {
			System.out.println("DRAW");
		}
	}
	
}
