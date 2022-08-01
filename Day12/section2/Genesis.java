package section2;

public class Genesis extends Car{
		
	void run() { // 부모 클래스에서 물려받은 이름이 같은 메소드를
				 // 덮어쓰기 한거에요.
		super.run(); // sysout(runrunrun!)
		System.out.println("가즈아아아아아");
	}

	int maxSpeed() { // Genesis의 최대 속력
		return 300;
	}
}
