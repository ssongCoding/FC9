package section3;

public class Samsung extends Computer{ // 자식 클래스
	
	String color = "하얀색";
	
	void powerOn() {
		super.powerOn(); // 부모 클래스의 powerOn()을 호출
		System.out.println("삼성 로고가 짜잔");
		System.out.println(super.color);
	}
}
