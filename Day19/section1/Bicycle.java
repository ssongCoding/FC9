package section1;

public class Bicycle {
	
	private String color;
	private int wheel = 2;
	
	Bicycle(String color) { // 생성자 1
		this.color = color;
//		wheel = 2;
	}
	
	Bicycle(String color, int wheel) { // 생성자 2
		this(color); // this.color = color 대신 해줄 생성자1을 호출
		this.wheel = wheel;
	}
	
	String getColor() {
		return color;
	}
	
	int getWheel() {
		return wheel;
	}
}
