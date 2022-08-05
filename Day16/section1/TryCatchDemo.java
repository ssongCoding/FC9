package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchDemo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		try {
			int a = 4 / 0; // 예외에 걸리면, 바로 튀어나갑니다.
						   // 남은 코드는 안봐요!
			String str = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
			
			// 다시 입력 받기를 시킨다던가
			// 프로그램을 종료시켜버린다던가
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0으로 나누지마");
		}
	}
}
