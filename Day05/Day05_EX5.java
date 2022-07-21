package example;

public class Day05_EX5 {

	public static void main(String[] args) {
		
		int num = 3; //num = num + 1; - 증가 연산자
		System.out.println(num++); // 3 --> 4
		System.out.println(num); // 4
		System.out.println(++num); // 5
		System.out.println(num++); // 5로 출력 --> 6
		System.out.println(++num); // 7 
		
		int n = 10;
		System.out.println(++n); // 11
		System.out.println(n); // 11
		System.out.println(n++ + " " + ++n);// 11로 출력 --> 12 --> 13
		
		int m = 27;
		System.out.println(--m); // 26
		System.out.println(m--); // 26으로 출력 --> 25
		System.out.println(--m + " " + --m); // 24 23
	}

}
