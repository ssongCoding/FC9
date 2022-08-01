package section2;

public class Road {	// 실행용 클래스
	public static void main(String[] args) {
		Genesis gv80 = new Genesis();
		gv80.run();
		gv80.stop();
		System.out.println("gv80의 바퀴수는 " + gv80.wheel );
		System.out.println("gv80의 최대 속력은 " + 300 +"입니다.");
	}
}