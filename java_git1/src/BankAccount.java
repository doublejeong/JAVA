// this는 두가지 용도 = 객체가 생성되었을때 자기 자신을 뜻함
// this 생성자 = 다른 생성자에서 생성자 호출 할때는 this 생성자 호출

class BankAccount1 {
    int balance = 0;     // 예금 잔액
    
    BankAccount1() {		// 디폴트 생성자 = 컴파일러가 개발자가 안넣게 되면 기본적으로 넣음
//    	this(1000);
    	System.out.println("생성자 시작");
    }
    BankAccount1(int balance) {
//    	this();
    	this.balance = balance;
    	System.out.println("생성자 시작2");
    }
    /* 생성자를 한개라도 개발자가 만들면 디폴트 생성자를 컴파일러가 만들어 주지 않는다. */

    
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

public class BankAccount {

	public static void chek(BankAccount1 acc) {
		acc.checkMyBalance();
	}

	public static void main(String[] args) {
		
		String name = "홍길동";
		
		
		String str1 = "Happy";
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		
		
		///////////////////
		
		
		BankAccount1 ref1 = new BankAccount1();
		BankAccount1 ref2 = ref1;

		BankAccount1 ref3 = new BankAccount1(2000);
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
		
//		1. null -> 참조형에만 넣을수 있음 (int num (x))
//		2. 아무것도 가리키지 않은 상태
//		3. 활용 : 참조형에 null로 지정하게되면 JVM으로 하여금 할당 되었던 메모리를 회수 하라는 의미임
		
		BankAccount1 ref = null;
		ref = new BankAccount1();

//		ref = null;
		
		ref.deposit(3000);
		ref.withdraw(300);
		chek(ref);		//'참조값'의 전달
	}
}
