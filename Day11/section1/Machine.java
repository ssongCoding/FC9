package section1;

public class Machine {
	String name; // 기계 이름
	private int elec; // 사용 전기량 필드
	static int totalElec;	  // 총 사용량 필드
	
	Machine(String n, int e) {
		name = n;
		elec = e;
	}
	
	// elec getter
	int getElec() {
		return elec;
	}
	
	// elec setter
	void setElec(int e) {
		elec = e;
	}
	
	void powerOn() {
		totalElec = totalElec + elec;
		System.out.println(name + "가(이) 켜졌습니다. "
				+ name + "의 전기 사용량은 " + elec + " 입니다.");
		System.out.println("지금까지 총 전기 사용량은 " 
						+ totalElec +" 입니다.");
	}
}