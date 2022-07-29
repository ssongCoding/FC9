package section3;

class Member {
	String name;
	int age;
	static int count = 0; // 총 입장 횟수
	static int countAdult = 0; // 성인(20세 이상) 입장 횟수
	static int countChild = 0; // 청소년(19세 이하) 입장 횟수
	
	Member(String n, int a) { // + 추가 역할 : 필드값을 알아서 자동 초기화
		name = n;
		age = a;
	}
	
	void enter() {
		if(age >= 20) {
			countAdult = countAdult + 1;
			System.out.println("오늘 성인 회원은 " + countAdult 
					+ "명 입장하셨습니다.");
		} else { // age <= 19
			countChild = countChild + 1;
			System.out.println("오늘 청소년 회원은 " + countChild 
					+ "명 입장하셨습니다.");
		}
		
		count = count + 1; // 입장 횟수 + 1
		System.out.println("오늘 " + count + "명 입장하셨습니다.");
	}
}

public class Pool {
	public static void main(String[] args) {
		Member sumin = new Member("수민", 13);
		sumin.enter();
		
		Member cheolsoo = new Member("철수", 27);
		cheolsoo.enter();
		
		Member choolsoo = new Member("출수", 27);
		choolsoo.enter();
	}
}
