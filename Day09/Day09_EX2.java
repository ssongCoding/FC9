package example;

class Lesson {
	private String language;
	
	// 생성자
	Lesson(String l) {
		language = l;
	}
	
	// language의 getter
	String getLanguage() {
		return language;
	}
	
	// language의 setter
	void setLanguage(String l) {
		language = l;
	}
}

public class Day09_EX2 {

	public static void main(String[] args) {
		Lesson java = new Lesson("자바");
		Lesson python = new Lesson("파이썬");
		
		System.out.println(java.getLanguage() + "반 입니다.");
		// 자바반 입니다.
		System.out.println(python.getLanguage() + "반 입니다.");
		// 파이썬반 입니다.
	}
}
