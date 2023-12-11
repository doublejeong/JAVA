class TV {
	String brand;
	int year, inch;
	
	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	void show () {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
public class TV01 {
	public static void main(String[] args) {
		
		TV myTV = new TV ("LG", 2017, 32);
		myTV.show();
	}
}
