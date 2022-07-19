
public class Day03_EX3 {

	public static void main(String[] args) {

		int score = 79;
		char result;
		
		if (score >= 90) {
			result = 'A';
		} else if (score >= 80) { // 90 > score >= 80
			result = 'B';
		} else if (score >= 70) { // 80 > score >= 70
			result = 'C';
		} else if (score >= 60) { // 70 > score >= 60
			result = 'D';
		} else {				  // 60 > score
			result = 'F';
		}
		System.out.println("제 학점은 " + result + "입니다.");
	}
}
