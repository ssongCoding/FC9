package example;

/*
 * 학생을 만들 수 있는 설명서 껍데기 .. 1
 * 학생의 나이 필드 .. 2
 */
class Student { // .. 1
	int age = 19; // .. 2
	
	void introduce() { // 메소드 선언 - 기능 수행!
		System.out.println("안녕하세요");
		System.out.println("제 이름은 김송아 입니다.");
		System.out.println("감사합니다");
	}
}

public class Day07_EX2 {
	public static void main(String[] args) {
		/*
		 * 학생 객체 songa .. 3
		 * songa의 나이 출력 .. 4
		 */
		Student songa = new Student();
		System.out.println("songa 나이는 " + songa.age);
		
		for (int i = 0; i < 5; i++) {
			songa.introduce();
		}
	}
}
