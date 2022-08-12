package section2;

import java.util.*;
//        패키지명.* <-- 이 패키지에 있는 모든 클래스를 사용할 수 있는거에요.

//import java.util.Stack;
//          패키지.클래스
//import : 다른 패키지에 있는 클래스를 쓰기 위해서, 클래스/패키지 수입해오기

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();  
		s.push("melon");
		s.push("strawberry");
		s.push("watermelon");
		System.out.println(s);
		
		s.pop(); // 무조건 탑 젤 위에꺼 꺼내줄거에요.
		System.out.println(s);
		
		System.out.println(s.contains("melon"));
		System.out.println(s.peek()); // 젤 위에 있는 값을 반환
		System.out.println(s.empty());
		System.out.println(s.isEmpty());
	}
}



