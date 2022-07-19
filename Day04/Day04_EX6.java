
public class Day04_EX6 {

	public static void main(String[] args) {
		/**
		 * corona +1 : while문 한 바퀴 당
		 * 			   "확진자수는 0명입니다."
		 * corona 10명이 되면 "거리두기 1단계 시행 할거에요." 출력
		 */
		int corona = 5;
		
		while (corona < 10) {
			System.out.println("확진자는 "+corona+"명 입니다.");
			corona = corona + 1;
		}
		// corona 확진자 = 10명
		System.out.println("확진자가 " + corona + "명 이므로 거리두기 1단계 시행");
	}

}
