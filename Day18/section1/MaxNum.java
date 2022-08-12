package section1;

public class MaxNum {

	public static void main(String[] args) {
		
		int arr[] = {4, 6, 2};
		int maxNum = arr[0]; // 3개 수 중에 가장 큰 값
		
		for (int i = 1; i < arr.length; i++) { // 1, 2
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		
		System.out.println(maxNum); // 6		
	}
}
