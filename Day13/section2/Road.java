package section2;

public class Road {
	public static void main(String[] args) {
		BMW bmw = new BMW(500);
		System.out.println(bmw.maxSpeed); // 500
		
		Tico tico = new Tico(150);
		System.out.println(tico.maxSpeed); // 150
	}
}
