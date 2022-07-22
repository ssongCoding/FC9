package example;

public class Day06_EX4 {

	public static void main(String[] args) {
		int score[] = {70, 95, 85};
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) { // score
			sum = sum + score[i];
			// i = 0 --> sum = 0, score[0] = 70 => 70 = sum 교체
			// i = 1 --> sum = 70, score[1] = 95 => 165 = sum 교체
			// i = 2 --> sum = 165, score[2] = 85 => 250 = sum 교체
		}
		
		System.out.println(sum/score.length);
		// 국   영  수 : 세 과목의 평균을 구해주세요.
		// 세 과목의 점수의 합 / 과목 수
		// 제한시간 : 쉬는 시간 포함 (~3:37)
	}
}
