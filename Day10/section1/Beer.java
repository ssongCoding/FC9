package section1;

public class Beer {
	static String company; // 클래스 하나에 필드 1개
	String favor; // 객체가 만들어질 때마다 1개씩 더 생성될거에요.
				  // 객체 1개를 위한 필드
				  // (객체들 마다 하나씩 들고 있으니까요!)
	
	Beer(String c, String f) {
		company = c;
		favor = f;
	}
}
