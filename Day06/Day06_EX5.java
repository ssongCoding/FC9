package example;

public class Day06_EX5 {

	public static void main(String[] args) {
		
		// 3 6 9 ... 99 총 33개의 3의 배수를 배열에 넣어볼게요.
		int num[] = new int[33]; // new : 새로운거 생성
							     // int[33] : int형 상자 33칸
								 // 0~32
		
		// 3 6 9 12 15 18 21 ... 99
		// 1 2 3 4  5  6  7 .... 33 * 3
		for (int i = 1; i*3 < 100; i++) {
			num[i-1] = i*3;
			System.out.println(num[i-1]);
		}		
		
		// 3 6 9 12 15 18 21 ... 99
		// 3 +3 ~ i < 100
		/*for (int i = 3; i < 100; i = i + 3) {
			System.out.println(i);
			num[0] = i; 
		}*/
		
	}
}
