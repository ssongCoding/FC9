
public class Day04_EX2 {

	public static void main(String[] args) {
		//double pie = 3.14;
		int num = 3;
		
		switch (num) {
			case 1:
				System.out.println("꽝");
				break; // 멈춰!
			case 4:
				System.out.println("당첨!");
				break;
			default: // 위 case들에 해당되지 않을 때, = else
				System.out.println("이도 저도 아니네요.");
		}
	}
}
