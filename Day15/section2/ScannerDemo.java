package section2;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nl = sc.nextLine(); // 한 줄 전체를 입력
		System.out.println(nl);
		
		String n = sc.next(); // 한 줄 읽는 건 맞는데.. 띄어쓰기도 끝난걸로 인지
		System.out.println(n);
		
//		System.out.println("첫번째 정수를 입력하세요.");
//		int num1 = sc.nextInt();
//		
//		System.out.println("두번째 정수를 입력하세요.");
//		int num2 = sc.nextInt();
//		
//		System.out.println(num1 + num2);
	}
}
