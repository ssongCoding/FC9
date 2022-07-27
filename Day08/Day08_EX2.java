package example;

class Lawyer { // 변호사 객체를 만들 클래스
	String name;
	private int age; // 나이에 대한 외부의 접근을 막은거에요. 
	
	int getAge() { // private age의 값을 리턴
		return age;
	}
	
	void setAge(int num) { // private age에 값을 넣는 메소드
						   // 왜 이건 가능한가요?
		if (num >= 1) {	   // age에 값을 넣기 전에 검증을 하셨네요.
			age = num;
		} else { // num < 1
			System.out.println("잘못된 나이를 입력하셨습니다.");
			age = 1;
		}
	}
	
	void introduce() {
		System.out.println("저는 " + name + "이고, "
				+ age + "살입니다.");
	}
	
	int plus(int a, int b) { // 정수 2개를 매개변수로 받음
		// a = 300; b = 500;
		return a+b; // 800
	}
}

public class Day08_EX2 {
	public static void main(String[] args) {
		Lawyer youngwoo = new Lawyer();
		youngwoo.name = "우영우";
		youngwoo.setAge(25);
		youngwoo.introduce();
		System.out.println(youngwoo.getAge());
	}
}