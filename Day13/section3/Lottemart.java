package section3;

public class Lottemart {
	public static void main(String[] args) {
		PotatoSnack poca = new PotatoSnack("yellow");
		PotatoSnack sumi = new PotatoSnack("white");
		
		SweetPotatoSnack kkang = new SweetPotatoSnack("brown");
		SweetPotatoSnack gogumi = new SweetPotatoSnack("yellow brown");
		
		poca.ASMR(); // 바삭바삭 포카포카
		sumi.ASMR(); // 바삭바삭 
		kkang.ASMR(); // 바삭바삭
		gogumi.ASMR(); // 구미구미 고구미
	}
}