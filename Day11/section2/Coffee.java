package section2;

public class Coffee {
	String name; // 커피 이름
	private String temp; // 핫 or 아이스
	
	public Coffee(String n, String t) { // default : 같은 패키지 안에서만 접근 가능
		name = n;
		temp = t;
	}
	
	void serve() {
		System.out.println("주문하신 " + temp + name + " 나왔습니다.");
	}
	
	// get && set 
}