class MyThread1 extends Thread {
	@Override
	public void run(){
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	}
}
class MyThread2 extends Thread {
	@Override
	public void run(){
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
	}
}

public class NotePad5 {

	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
	
		th1.start();
		th2.start();
	}
}
