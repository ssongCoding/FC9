package section1_1;

import java.util.Scanner;

public class Starbucks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 말씀해주세요.");
		String coffeeName = sc.nextLine(); // 커피 이름 입력
		
		Coffee coffee1 = new Coffee(coffeeName, 4500, "쓴 맛");
		coffee1.printPrice();
		coffee1.printTaste();
		
		
		System.out.println("주문하실 메뉴를 말씀해주세요.");
		String nonCoffeeName = sc.nextLine(); // 커피 이름 입력
		
		NonCoffee tea1 = new NonCoffee(nonCoffeeName, 4900, "차");
		tea1.printPrice();
		tea1.printKind();
	}
}
