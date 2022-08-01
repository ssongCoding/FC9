package section1;

public class Child extends Parent { // 객체 만드는 클래스
	
	int coin = 800; // 이름, 자료형이 부모클래스와 똑같은 필드를
				    // 자식클래스에서 다시 한번 선언하시면,
				    // 필드는 덮어쓰기 될거에요.
	
	void work() { // 200원을 벌어올게요.
		System.out.println("일을 갑니다.");
		coin = coin + 200; // 덮어쓰기 한적 없는 coin을 사용하신 거에요.
	}
	
	void pocket() { // 동전 얼마?
		System.out.println("자식에게는 " + coin + "원 있습니다.");
		System.out.println("부모에게는 " + super.coin + "원 있습니다.");
	}
}