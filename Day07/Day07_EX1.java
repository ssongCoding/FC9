package example;

class Car { // 자동차를 만드는 설명서
	// 설명서에 적어줄거에요 : 부품들이 뭐가 있는지
	// 변수 = 필드
	int wheel = 4;
	int window = 7;
	
	/*
	 * ride : 달립니다. (출력) ... 1
	 */
	void ride() { // .. 1
		System.out.println("달립니다.");
	}
}

public class Day07_EX1 { // 클래스
	public static void main(String[] args) { // main 메소드
		Car c1 = new Car(); // 설명서 가지고 c1 자동차를 만드셨어요.
		//int arr[] = new int[24];
		System.out.println("c1 자동차의 바퀴 수는 " + c1.wheel);
		System.out.println("c1 자동차의 창문 수는 " + c1.window);
		
		c1.wheel = 5; // 바퀴 수가 4 -> 5 바뀜!
		System.out.println("c1 자동차의 바퀴 수는 " + c1.wheel);
		
		Car c2 = new Car();
		System.out.println("c2 자동차의 바퀴 수는 " + c2.wheel);
		System.out.println("c2 자동차의 창문 수는 " + c2.window);
		
		c2.wheel = 6;
		c2.window = 10;
		System.out.println("c2 자동차의 바퀴 수는 " + c2.wheel);
		System.out.println("c2 자동차의 창문 수는 " + c2.window);
		/*
		 * c2야 달려! ... 2
		 */
		c2.ride();
	}
}