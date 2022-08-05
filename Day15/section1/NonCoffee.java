package section1;

public class NonCoffee extends Drink{

	String kind;
	
	NonCoffee(String name, int price, String kind) {
		super(name, price);
		this.kind = kind;
	}
	
	void printKind() {
		System.out.println(name + "은 " + kind + "입니다.");
	}
}
