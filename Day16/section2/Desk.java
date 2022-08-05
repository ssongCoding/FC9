package section2;

public class Desk {

	public static void main(String[] args) {
		Pencil p = new Pencil("BLACK", 800);
		Note n = new Note("국어", 2500);
		
		Bag b = new Bag();
		b.inMyBag(p, n);
		
		/*
		 * b.inMyBag(p, n); // 제 가방에는 RED 연필과 국어 공책이 있습니다.
		 *
		 */
//		b.inMyBag("나이키");
	}
}
