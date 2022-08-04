package section1;

public class Speaker {
	
	int maxVolume; // 스피커 최대 음량
	
	Speaker(int mv) { // 생성자
		maxVolume = mv;
	}
	
	void powerOn() {
		System.out.println("빠밤");
	}
	
	void powerOff() {
		System.out.println("띠로리로");
	}
}