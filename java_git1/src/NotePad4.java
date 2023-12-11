
class TV9 {
	private int size;
	public TV9(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
}
class ColorTV extends TV9 {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + this.color + "컬러");
	}
}

class IPTV extends ColorTV {
	String ip;
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 " + this.ip + "주소의 ");
		super.printProperty();		// 위에 프린트프로퍼티 땡겨와서 쓴다.
	}
	
}

// 상속은 그닥 좋은게 아님.

public class NotePad4 {

	public static void main(String[] args) {

		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty(); //32인치 1024컬러

		   ///////////////////////////////////////
		   
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		   iptv.printProperty();	//나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
		   
		   ///////////////////////////////////////
		   
		   
		   
		   
	}

}
