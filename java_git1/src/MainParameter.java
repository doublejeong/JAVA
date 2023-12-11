import java.util.Random;
import java.util.Scanner;

public class MainParameter {
	public static void main(String[] args) {
		
		int[] ar = {1, 2, 3, 4, 5};
		
		//배열 요소 전체 출력
		for(int e: ar) {
			System.out.print(e + " ");
		}
		System.out.println();		//딘순 줄 바꿈을 목적으로
		
		int sum = 0;
		
		//배열 요소의 전체 합 출력
		
		for(int e: ar) {
			sum += e;
		}
		System.out.println("sum : " + sum);

////////////////////////
	
		int[][] arr = new int[3][4];
		int num = 1;

		//	배열에 값을 저장
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		//	배열에 저장된 값을 출력
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
////////////////////////
		
		int[][] arr2 = {
				{11},
				{22, 33},
				{44, 55, 66}
		};

		// 배열의 구조대로 내용 출력
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
////////////////////////

		Scanner sc = new Scanner(System.in);
		int x,y;
		
		while (true) {
			System.out.println("행을 입력하세요 (1~10)");
			x = sc.nextInt();
			if (x >= 1 && x <= 10) {
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
			
		}
		
		while (true) {
			System.out.println("열을 입력하세요 (1~10)");
			y = sc.nextInt();
			if (y >= 1 && y <= 10) {
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
			
		}
		
		
		char[][] arr3 = new char[x][y];
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				arr3[i][j] = (char)(Math.random() * 26 + 65);
			}
		}
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		////////////////////////////////
		
		

		
		
		
		
	}
	
}
