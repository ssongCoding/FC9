package example;

public class Day06_EX2 {

	public static void main(String[] args) {
		/*
		 * num1, num2, num3 정수형 변수
		 * sysout으로 하나씩 출력
		 */
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		int num[] = {10, 20, 30}; // 첫번째 방법 : C언어와 동일
		// int[] num = {10, 20, 30}; // 두번째 방법
		
		for (int i = 0; i < num.length; i++) {
						// sizeof(num)/sizeof(int) : C언어
			System.out.println(num[i]);
		}
	}
}
