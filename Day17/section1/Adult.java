package section1;

public class Adult extends Person{

	Adult(String name) {
		super(name);
	}

	@Override
	void borrowTowel() {
		pocket.setMoney(pocket.getMoney() - 1000);
	}
}
