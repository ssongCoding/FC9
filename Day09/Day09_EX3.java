package example;

class CreditCard {
	private String company;
	
	CreditCard(String c) { // 객체를 생성함과 동시에 필드에 값도 넣어줌
		company = c;
	}
	
	// company의 getter
	String getCompany() {
		return company;
	}
	
	// company의 setter
	void setCompany(String s) {
		company = s;
	}
}

public class Day09_EX3 {
	public static void main(String[] args) {
		CreditCard lotte = new CreditCard("롯데");
		CreditCard KB = new CreditCard("KB");
		CreditCard hyundai = new CreditCard("현대");
		
		System.out.println(lotte.getCompany() + "카드입니다.");
		// 롯데카드입니다
		// KB카드입니다
		// 현대카드입니다
	}
}
