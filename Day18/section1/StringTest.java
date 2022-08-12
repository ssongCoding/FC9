package section1;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";
		String p = "pine";
		
		// String(문자열) 합치기 : +
		String pa = p + a;
		System.out.println(pa);
		
		// String 길이 구하기 : String.length();
		int size_a = a.length();
		System.out.println(size_a);
		
		// String 안에 문자 쪼개기
		for (int i = 0; i < size_a; i++) { // 0~4
			System.out.println("a.charAt(i) : " + a.charAt(i));
		}
		
		// String 비교
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str3);
		
		if (str1 == str3) {
			System.out.println("str1 == str3 : 같습니다.");
		}
		
		if (str1.equals(str3)) { // 객체 비교 X
								 // 객체 안에 들어있는 글자 하나하나를 비교해주는 메소드
			System.out.println("str1.equals(str3) : 같습니다.");
		}
		
		if (str1 == str2) { // 객체(상자) 비교
							// 안에 들어있는 글자는 상관하지 X
			System.out.println("str1 == str2 : 같습니다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("str1.equals(str2) : 같습니다.");
		}
	}
}
