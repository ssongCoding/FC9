package section1;

public class Starbucks {
	public static void main(String[] args) {
		// 쉬는 시간 : ~ 14:48
		Coffee americano = new Coffee("Americano", 4500, "쓴 맛");
		Coffee latte = new Coffee("latte", 5000, "고소한 맛");
		
		NonCoffee greenTea = new NonCoffee("GreenTea", 4900, "차");
		NonCoffee coconutSmoothie = new NonCoffee("coconutSmoothie", 6300, "스무디");
		
		americano.printPrice();
		americano.printTaste();
		latte.printPrice();
		latte.printTaste();
		
		greenTea.printPrice();
		greenTea.printKind();
		coconutSmoothie.printPrice();
		coconutSmoothie.printKind();
	}
}
