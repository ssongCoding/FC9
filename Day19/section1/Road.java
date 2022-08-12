package section1;

public class Road {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle("Black");
		Bicycle b2 = new Bicycle("Mint", 4);
		
		System.out.println(b1.getColor() + " " + b1.getWheel());
		System.out.println(b2.getColor() + " " + b2.getWheel());
	}
}
