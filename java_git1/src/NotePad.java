
class InstCnt {

//	static = 먼저(new 객체 생성보다 먼저) 한번 올려 공유(어디에다 method area 에다)
//	static 변수 = 공유변수 = class 변수 = 정적변수	
//	함수와 변수에만 사용된다
//	집나간 토끼

	static int instNum = 0;		//클래스 변수 (static 변수)
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스생성: " + instNum);
	}
}


//	함수 오버로딩 = 같은 함수 이름을 쓸 수 있다.(파라미터 데이터 타입 또는 갯수를 달리해서)
class A {
	public void a() {
		System.out.println("함수 a");
	}
	public void a(int a) {
		System.out.println("함수 a" + a);
	}
	public void a(double a) {
		System.out.println("함수 a double" + a);
	}
	public void a(int a, int b) {
		System.out.println("함수 a" + (a +b));
	}
}

//////////////////////////////

class Person1 {
	private int regiNum;	// 주민등록 번호
	private int passNum;	// 여권 번호

	Person1(int rnum, int pnum) {
		this.regiNum = rnum;
		this.passNum = pnum;
	}

	Person1(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}
	void showPersonalInfo() {
		System.out.println("주민등록 번호 : " + regiNum);
		if (passNum != 0) {
			System.out.println("여권번호 : " + passNum + '\n');
			
		} else {
			System.out.println("여권을 가지고 있지 않습니다. \n");
		}
	}
}


public class NotePad {
	public static void main(String[] args) {

//		여권 있는 사람의 정보를 담은 인스턴스 생성
		Person1 jung = new Person1 (335577,112233);
//		여권 없는 사람의 정보를 담은 인스턴스 생성
		Person1 hong = new Person1 (775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
		
////////////////////////////		
		
	A a = new A();
	a.a();
	a.a(7);
	a.a(10.0);
	a.a(7,3);
	
	System.out.println(100);
	System.out.println(true);
	System.out.println(10.0);
	System.out.println(a);
		
	InstCnt cnt1 = new InstCnt();
	InstCnt cnt2 = new InstCnt();
	InstCnt cnt3 = new InstCnt();
	
	}
}
