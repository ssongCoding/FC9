package section2;

import java.io.BufferedReader; // 다른 패키지의 클래스를 가져다 쓰실 때
import java.io.IOException;
import java.io.InputStreamReader; // 우리는 import 패키지 풀네임.클래스명

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		//InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = 5;
		System.out.println(5); // 5
		
		String str = br.readLine();
		// ★ BufferedReader는 다양한 메소드를 가지고 있어요.
		// 필요하실 때 찾아쓰면 되요, 어떻게? 구글링하셔서요.
		
		System.out.println(str);
	}
}
