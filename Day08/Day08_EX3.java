package example;

class Calc {
	
	private String brand;
	
	// Setter : brand 값 설정 - 보통 리턴값이 없어요
	void setBrand(String name) {
		brand = name;
	}
	
	// Getter : brand 값 가져다 줄 친구 - 보통 리턴값이 있어요
	String getBrand() {
		return brand;
	}
	
	int minus(int a, int b){
		// 매개변수 : int a, int b = 메소드 안에서만 쓸거에요
		return a-b;
	}
	
	int multiple(int a, int b){
		return a*b;
	}
}

public class Day08_EX3 {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		System.out.println(c1.minus(7, 1));
		System.out.println(c1.multiple(3, 4));
		c1.setBrand("카시오"); // c1.brand = "카시오";
		System.out.println("계산기 브랜드는 " + c1.getBrand()
					+ "입니다.");
	}
}
