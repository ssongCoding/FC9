package section3;

public class Academy { // 실행용 클래스
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.powerOn(); // Samsung클래스에 (부모클래스 메소드 이름과 같은) powerOn()이 있으면,
					 // Samsung클래스의 powerOn()을 부른 거	
					
					 // Samsung클래스에 powerOn()이 없을 땐,
					 // 부모클래스(Computer)의 powerOn()을 부른 거
		
		System.out.println(s.color);
		// Samsung클래스에 (부모클래스 필드 이름과 같은) color가 있으면,
		// Samsung클래스의 color를 갖다 쓸거에요	
		
		// Samsung클래스에 color가 없을 땐,
		// 부모클래스(Computer)의 color를 갖다 쓴거에요.
	}
}
