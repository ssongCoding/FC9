package section1;

public class LG extends Speaker{
	LG(int mv) {
		super(mv);
	}

	void powerOn() {
		super.powerOn(); // 빠밤
		System.out.println("사랑해요 엘지");
	}
}
