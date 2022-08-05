package section1_1;

public class Drink {

	String name;
	int price;
	
	Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void printPrice() {
		System.out.println(name + "의 가격은 " + price + "원입니다.");
	}
}
