package example;

class Jogger {
	int bottle;
	
	void ride() {
		System.out.println("씽씽씽");
	}
	
	void bottleNum() {
		System.out.println("저는 " + bottle 
				+ " 개의 물통을 들고 있습니다.");
	}
}

public class Day08_EX1 {
	public static void main(String[] args) {
		Jogger kim = new Jogger();
		kim.bottle = 20;
		kim.ride();
		kim.ride();
		kim.bottleNum();
	}
}
