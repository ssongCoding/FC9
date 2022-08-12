package demo;

public class Coffee {
	String name;
	int price;
	
	Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void info() {
		System.out.println(name + ", " + price + "원");
	}
}
