package section2;

class Moongu { // Note와 Pencil의 부모
	// int 가격 <- 생성자
	int price;
	
	Moongu(int price) {
		this.price = price;
	}
	
	int printPrice() {
		return price;
	}
}

class Note extends Moongu{
	private String subject; // 국 영 수
	
	Note(String subject, int price) {
		super(price); // Moongu 클래스의 생성자 Moongu(price) 호출
		this.subject = subject;
	}
	
	// subject의 getter
	String getSubject() {
		return subject;
	}
	
	// subject의 setter
	void setSubject(String subject) {
		this.subject = subject;
	}
}

class Pencil extends Moongu{
	private String color;
	
	Pencil(String color, int price) {
		super(price); // <-- 부모 객체 생성됨
		this.color = color;
	}
	
	// color의 getter
	String getColor() {
		return color;
	}
	
	// color의 setter
	void setColor(String color) {
		this.color = color;
	}
}

public class Bag {
	
	void inMyBag(String brand) {
		System.out.println("제 가방은 " + brand + "꺼입니다.");
	}
	
	void inMyBag(Pencil p) {
		System.out.println("제 가방에는 " + p.getColor() + "연필이 있습니다.");
	}
	
	void inMyBag(Pencil p, Note n) {
		System.out.println("제 가방에는 " 
				+ p.printPrice() + "원 짜리 " 
				+ p.getColor() + " 연필과 " 
				
				+ n.printPrice() + "원 짜리 "
				+ n.getSubject() + " 공책이 있습니다.");
	}
}
