package example;

class Pen {
	private String brand;	// 펜의 브랜드
	private int num;		// 펜의 개수
	
	Pen(String b, int n) {
		brand = b;
		num = n;
	}
	
	/*Pen() { 
		객체 생성하는 거 말고, 할 일이 딱히 없을 때 -> 생략 가능
	}*/
	
	// brand Getter : 브랜드 이름을 반환해줄 친구
	String getBrand() {
		return brand;
	}
	
	// brand Setter : 브랜드 이름을 설정해줄 친구
	void setBrand(String b) {
		brand = b;
	}
	
	// num Getter
	int getNum() {
		return num;
	}
	
	// num Setter
	void setNum(int n) {
		num = n;
	}	
}

public class Day09_EX4 {
	public static void main(String[] args) {
		Pen monami = new Pen("모나미", 3);	
		System.out.println("저는 " + monami.getBrand()
					+ " 브랜드의 펜이 " + monami.getNum() + "자루 있습니다.");
	}
}
