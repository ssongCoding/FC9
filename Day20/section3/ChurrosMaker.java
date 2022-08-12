package section3;

// 츄러스 만드는 사람
public class ChurrosMaker {
	
	Churros chu;
	private String name;
	
	ChurrosMaker(String name) {
		this.name = name; 
	}
	
	void hello() {
		System.out.println("안녕하세요, " + name +"입니다.");
		System.out.println("무엇을 주문하시겠어요?");
	}
	
	// jason.makeChurros(order)
	void makeChurros(String order) {
		// Churros 객체를 만들거에요.
		chu = new Churros(order);
		System.out.println("츄러스 만드는 중...");
	}
	
	void serveChurros() {
		System.out.println("주문하신 " + chu.menu + "츄러스 나왔습니다.");
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}
