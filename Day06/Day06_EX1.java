package example;

public class Day06_EX1 {

	public static void main(String[] args) {
		
		for (int i=1; i*3<100; i++) {
			System.out.print(i*3 + " ");
		}
		/*
		 * 3~99 3의 배수만 출력 해주세요.
		 * 3 6 9 12 15 18 21 ... 96 99
		 * 3 6 9 12 15 18 ... < 100 ; i+3
		 * 
		 * 제한시간 : 4분 ~14:21
		 */		
	}

}
