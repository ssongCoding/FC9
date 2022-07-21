package example;

public class Day05_EX4 {

	/*
	 * 2 X 1 = 2
	 * 2 X 2 = 4
	 * ...
	 * 2 X 9 = 18
	 * 
	 * 3 X 1 = 3
	 * ...
	 * 
	 * 제한 시간 : 5분, ~15:24분
	 */
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++ ) { // 2 ~ 9 까지
			//System.out.println("1111111111111");
			for (int j = 1; j <= 9; j++) { // 1 ~ 9까지 
				System.out.println(i + " X " + j + " = " + i*j);
				//System.out.println("2222222222222");
			}
			System.out.println("333333333333");
		}
		//System.out.println("44444444444");
	}
}
