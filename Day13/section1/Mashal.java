package section1;

public class Mashal extends Speaker{
	
	Mashal(int mv) { // Mashal의 생성자
		super(mv); // 부모클래스의 생성자 호출 (객체의 실체를 만들어줘야)
	}

	void powerOn() {
		super.powerOn(); // 빠밤
		System.out.println("안녕하세요, 오늘 기분은 어떠신가요?");
	}
}
