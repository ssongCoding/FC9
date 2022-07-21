package example;

public class Day05_EX3 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i = i + 1) { // 1,2,3,4
			for (int j = 1; j <= 3; j = j + 1) { // 1, 2, 3 
				System.out.println("i = " + i + " j = " + j);
			}
		}
		
		int n = 10;
		int m = 20;
		System.out.println(n*m);
	}
}
