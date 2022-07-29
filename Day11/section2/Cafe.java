package section2;

public class Cafe {
	public static void main(String[] args) {
		Coffee americano = new Coffee("아메리카노", "아이스");
		Coffee latte = new Coffee("카페라떼", "아이스");
		
		System.out.println(americano.name);
		
		americano.serve(); // 주문하신 아이스아메리카노 나왔습니다.
				// private X
				// (default) : Coffee가 같은 패키지에 있으니까요.
				// public : 같은 프로그램 이니까요
	}
}
