package section2;

public class BookStore {

	public static void main(String[] args) {
		Book b1 = new Book("해리포터", 1);
		Book b2 = new Book("이클립스", 3, 300);
						// 책 이름, 시리즈, 총 페이지 수
		Book b3 = new Book("신데렐라", 2, 100);
		
		System.out.println(b1.title); // 해리포터
		System.out.println(b1.series);// 1
		System.out.println(b1.pages); // 50
		System.out.println();
		
		System.out.println(b2.title); // 이클립스
		System.out.println(b2.series);// 3
		System.out.println(b2.pages); // 300
		System.out.println();
		
		System.out.println(b3.title); // 신데렐라
		System.out.println(b3.series);// 2
		System.out.println(b3.pages); // 100
		System.out.println();
	}
}
