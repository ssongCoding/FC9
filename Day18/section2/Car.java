package section2;

public class Car {
	String company;
	int maxSpeed;
	String color;  // = "Black"; // 방법 2!
	
	Car(String company) {
		this.company = company;
	}
	
	void setSpec(int maxSpeed) { // 메소드 오버로딩
		this.maxSpeed = maxSpeed;
//		color = "Black"; // 방법 1
	}
	
	void setSpec(int maxSpeed, String color) {
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	
	void spec() {
		System.out.println("MaxSpeed " + maxSpeed 
				+ ", Color : " + color);
	}
}
