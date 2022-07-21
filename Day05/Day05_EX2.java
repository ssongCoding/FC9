package example;

public class Day05_EX2 {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i = i + 1) {// 1~4 : 4번
			System.out.println("안녕하세요.");
			// i는 이 안에서만 움직여요
		}
//		System.out.println(i);
		
		// i, j, k, ...
		for (int j = 9; j >= 1; j = j - 1) {
			System.out.println(j);
		}
	}
}
