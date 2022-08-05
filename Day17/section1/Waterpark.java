package section1;

public class Waterpark {

	public static void main(String[] args) {
		Adult songa = new Adult("송아");
		Pocket pocket = new Pocket(10000);
		songa.setPocket(pocket);
		songa.buyChurros();
		songa.borrowTowel();
		System.out.println(songa.getPocket().getMoney());
		
		Child ssong = new Child("쏭");
		Pocket smallPocket = new Pocket(5000);
		ssong.setPocket(smallPocket);
		ssong.borrowTowel();
		System.out.println(ssong.getPocket().getMoney());
	}
}