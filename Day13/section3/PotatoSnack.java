package section3;

public class PotatoSnack extends Snack{

	PotatoSnack(String color) {
		super(color);
	}
	
	void ASMR() {
		super.ASMR(); // 부모 클래스 - 바삭바삭
		System.out.println(" 포카포카");
	}
}
