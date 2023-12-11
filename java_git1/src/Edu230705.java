import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


////////////////////////멀티쓰레드 ////////////////////////////
//class MyThread1 extends Thread {
//	@Override
//	public void run() {
//		System.out.println(getName());
//		
//		for (int i = 0; i < 300; i++) {
//			System.out.println("-");
//		}
//	}	//run()
//}

class MyThread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
		
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println(getName());
		
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
	}	//run()
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
	}	//run()
}

class MyThread4 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try { Thread.sleep(1000);	//1초 동안 지연 / delay / 멈춘다
			} catch(Exception e) {
			}
		}
		
	}	//run()
}

////////////////////////////////////////////////////////////////////

class CountDownThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try { Thread.sleep(1000);
			} catch(Exception e) {
			}
		}
	}
}

////////////////////////////////////////////////////////////////////

class Account {
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			balance = balance - money;
		}
	}
}

class RunnableAccount implements Runnable {

	Account acc = new Account();
	
	@Override
	public void run() {
		
		while(acc.balance > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("::balance:" + acc.balance);
		}
	}
}


public class Edu230705 {

	public static void main(String[] args) {

//		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
//		String es = "Life is long if you know how to use it.";
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
//			bw.write(ks, 0, ks.length());
//			bw.newLine(); 		//줄 바꿈 문자를 삽입 (운영체제 별 줄 바꿈의 표시 방법이 다름)
//			bw.write(es, 0, es.length());
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
////////////////////////////////////////////////////////////////////
		
//		try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))) {
//			String str;
//			
//			while(true) {
//				str = br.readLine();		//한 문장 읽어 들이기
//				if(str == null) {
//					break;
//				}
//				System.out.println(str);
//			}
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}

////////////////////////////////////////////////////////////////////
////////////쓰레드 (thread)
////////////////////////////////////////////////////////////////////
//		1. 쓰레드는 프로그램(프로세시) 안에 또 다른 프로그램(쓰래드)
//		2. 쓰레드의 실행 시점은 알수가 없음 - 전적으로 OS의 스케쥴링 알고리즘에 따라 움직이므로
//		3. 프로그램은 기본적으로 쓰레드를 기준으로 컨텍스트 스위칭 됨
//		4. 싱글 프로세스는 기본적으로 main 쓰레드가 있다.

		
//		//싱글쓰레드
//		for (int i = 0; i < 300; i++) {
//			System.out.println("-");
//		}
//
//		for (int i = 0; i < 300; i++) {
//			System.out.println("|");
//		}
		
		//멀티쓰레드
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
//		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
//		th1.start();	//run을 바로 실행 시키면 안됨

		Runnable runnable = new MyThread1();
		
		Thread th3 = new Thread(runnable);
		th3.start();
		
		th2.start();
	
////////////////////////////////////////////////////////////////////
		
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//		System.out.println("입력하신 값은 " + input + "입니다.");
//		
//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try { Thread.sleep(1000);	//1초 동안 지연 / delay / 멈춘다
//			} catch(Exception e) {
//			}
//			
//		}
		
		String name1 = Thread.currentThread().getName();
		System.out.println(name1);
		
		MyThread3 th5 = new MyThread3();
		MyThread4 th4 = new MyThread4();
	
		th5.start();
		th4.start();

////////////////////////////////////////////////////////////////////

		CountDownThread countdownThread = new CountDownThread();
//		countdownThread.start();

	
////////////////////////////////////////////////////////////////////

		Runnable r = new RunnableAccount();
		
		Thread t1 = new Thread(r, "첫번째");
		Thread t2 = new Thread(r, "두번째");
	
		t1.start();
		t2.start();
	}
}
