package section1_1;

public class Coffee extends Drink{
	String taste;
	
	Coffee(String name, int price, String taste) {
		super(name, price); // 부모클래스 생성자
		this.taste = taste;
	}
	
	void printTaste() {
		System.out.println(name + "은 " + taste + "입니다.");
	}
}
