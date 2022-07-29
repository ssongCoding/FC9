package section2;

class User {
	String name;
	int age;
	static int loginCount; // 로그인 횟수
	
	User(String n, int a) {
		name = n;
		age = a;
		loginCount = 0; // 필드 초기화 (매개변수 이용 X)
	}
	
	void login() {
		loginCount = loginCount + 1;
		System.out.println(name + "님의 로그인 횟수는 " + loginCount + "회 입니다.");
	}
}

public class Computer {
	public static void main(String[] args) {
		User kelly = new User("켈리", 19);
		User selly = new User("셀리", 23);
		
		kelly.login();
		kelly.login();
		kelly.login();
		kelly.login();
		kelly.login();

		selly.login();
		selly.login();
		selly.login();
	}
}
