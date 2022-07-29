package section1;

public class Supermarket {
	public static void main(String[] args) {
		Beer kloud = new Beer("롯데", "바나나"); // 바나나
		Beer fitz = new Beer("롯데", "사과");  // 사과
		
		System.out.println("kloud 제조 회사는 " + kloud.company
						+ "이고, " + kloud.favor + "향입니다.");
		System.out.println("fitz 제조 회사는 " + fitz.company
						+ "이고, " + fitz.favor + "향입니다.");
		
		Beer.company = "오비맥주";
		//kloud.company = "오비맥주";
		
		System.out.println("kloud 제조 회사는 " + kloud.company
				+ "이고, " + kloud.favor + "향입니다.");
		System.out.println("fitz 제조 회사는 " + fitz.company
				+ "이고, " + fitz.favor + "향입니다.");
	}
}
