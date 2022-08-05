package section2;

class Pen {
	int num; // 펜 개수
	String color; // 펜 색깔
	
	Pen(int num, String color) {
		this.num = num;
		this.color = color;
	}
	
	int printInfo() {
		System.out.println("펜 개수 : " + num 
				+ ", 펜 색깔 : " + color);
		return 1;
	}
	
	void printInfo(int year) {
		System.out.println("안녕하세요. " 
				+ year +"년도산 펜입니다.");
	}
}

public class MethodOverloadingTest {
	public static void main(String[] args) {
		Pen p = new Pen(3, "yellow");
		p.printInfo();
	}
}
