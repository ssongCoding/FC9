package section2;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// ArrayList 선언
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 1; i < 6; i++) {
			arrayList.add(i); // ArrayList에 원소 추가
		}
		
		System.out.println(arrayList); // [1, 2, 3, 4, 5]
		
		arrayList.remove(0); // arrayList[0] 값을 삭제
							 // [2, 3, 4, 5]
		arrayList.remove(1); 
		
		System.out.println(arrayList); // [2, 4, 5]
		
		System.out.println(arrayList.get(1)); // 원소 출력
		// ~15:35까지 쉬는 시간입니다. 
		// get + for --> 2 4 5
		for (int j = 0; j < arrayList.size(); j++) {
			System.out.print(arrayList.get(j) + " ");
		}
	}
}




