package demo;

public class CafeDemo {
	public static void main(String[] args) {
//		Coffee americano = new Coffee("아메리카노", 4500);
//		americano.info(); // 아메리카노, 4500원
		
		Barista kim = new Barista();
		Coffee c1 = kim.makeCoffee(); // 커피를 만들어랏!
		kim.serveCoffee();
		
		Barista.n;
	}
}
