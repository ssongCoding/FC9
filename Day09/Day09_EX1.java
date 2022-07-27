package example;

class Cat { // 생성자가 객체를 생성하는 거 빼고
			// 딱히 할일이 없을 때 생략되어 있어요.
	
	private String name; // 이름 필드 - private
	
	Cat(String n) { // 특별한 메소드 "생성자"
			// 필드에 "원하는" 값을 넣어서 객체를 초기화할 수 있어요.
		name = n;
	}	
	
	// Getter
	String getName() {
		return name;
	}
	
	// Setter
	void setName(String n){
		name = n;
	}
}

public class Day09_EX1 {
	
	public static void main(String[] args) {
		Cat nabi = new Cat("나비");
		System.out.println("제 고양이 이름은 " + nabi.getName()
					+ "입니다.");
		
		//nabi.setName("나비");
//		System.out.println("제 고양이 이름은 " + nabi.getName()
//					+ "입니다.");
	}
}
