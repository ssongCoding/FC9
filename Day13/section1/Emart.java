package section1;

public class Emart {
	public static void main(String[] args) {
		Mashal mashal = new Mashal(300);
		mashal.powerOn(); // 출력 : 빠밤
						  //     : 안녕하세요, 오늘 기분은 어떠신가요?
		System.out.println(mashal.maxVolume);
		mashal.powerOff();// 출력 : 띠로리로
		
		LG lg = new LG(200);
		lg.powerOn(); // 출력 : 빠밤
				      //     : 사랑해요 엘지
		lg.powerOff(); // 출력 : 띠로리로
	}
}
