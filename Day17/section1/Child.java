package section1;

public class Child extends Person{

	Child(String name) {
		super(name);
	}

	@Override
	void borrowTowel() {
		pocket.setMoney(pocket.getMoney() - 500);		
	}
}
