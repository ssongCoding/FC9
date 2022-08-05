package section1;

abstract public class Person {
	private String name;
	protected Pocket pocket;
	
	Person(String name) { // 기본 생성자
		this.name = name;
	}
	
	void buyChurros() {
		pocket.setMoney(pocket.getMoney() - 2000);
	}
	
	abstract void borrowTowel();
	// 그럼 이제 Person 클래스를 상속받아가는 자식 클래스들은
	// 이 메소드를 반드시 구현해야 하겠죠.
	
	//setter -- pocket을 받을 메소드 : setPocket
	void setPocket(Pocket pocket) {
		this.pocket = pocket;
	}
	
	//getter -- pocket을 꺼내는 메소드
	Pocket getPocket() {
		return pocket;
	}
	
	//name의 getter
	String getName() {
		return name;
	}
	
	//name의 setter
	void setName(String name) {
		this.name = name;
	}
}
