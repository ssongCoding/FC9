package section2;

public class Road {

	public static void main(String[] args) {
		Car genesis = new Car("현대자동차");
		genesis.setSpec(500, "Red");
		genesis.spec(); // MaxSpeed 500, Color Red
		
		Car tico = new Car("현대자동차");
		tico.setSpec(100);
		tico.spec(); // MaxSpeed 100, Color Black		
	}
}
