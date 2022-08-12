package section3;

import java.util.Scanner;

public class ChurrosStore {
	public static void main(String[] args) {
		ChurrosMaker jason = new ChurrosMaker("jason");
		jason.hello(); // 안녕하세요, jason입니다.
					   // 무엇을 주문하시겠어요?
		
		Scanner sc = new Scanner(System.in);
		String order = sc.nextLine(); // String 값을 입력
		
		jason.makeChurros(order);
		jason.serveChurros(); // 주문하신 플레인 츄러스 나왔습니다.
	}
}
