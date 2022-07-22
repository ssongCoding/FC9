package example;

public class Day06_EX6 {

	public static void main(String[] args) {
		
		int arr[] = new int[24]; // 0 ~ 23
		// 4 8 12 ... 96 출력
		// 1 2 3      24 : i
		// 0 1 2 ...  23 : i-1
		for (int i = 1; i*4 < 100 ; i++) {
			System.out.print(i*4 + " ");
		}
		
		// 100   95   90    85 ...  5 총 20개의 5의 배수
		// 5*20     5*19     5*18     ... 5*1
		// 5*(20-0) 5*(20-1) 5*(20-2)
		//   0        1        2       3 ... 19 : j
		//   20       20       20      20 ... 20
		
		int num[] = new int[20]; // 0~19
		for (int j = 0; j <= 19; j++) { // 0~19
			num[j] = 5 * (20-j);
			System.out.println("num[" + j + "] = " + num[j]);
		}
		
	}
}
