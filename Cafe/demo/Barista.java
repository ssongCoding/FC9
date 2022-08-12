package demo;

public class Barista {
	Coffee c; // 커피 객체를 필드로 가지게
	static int n; 
	
	Coffee makeCoffee() {
		c = new Coffee("아메리카노", 4500);
		return c;
	}
	
	void serveCoffee() {
		System.out.println("주문하신 " + 
				c.name + " 나왔습니다.");
	}
}
