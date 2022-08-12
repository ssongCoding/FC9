package section2;

public class Book {
	String title;	// 책 제목
	int series;		// 시리즈
	int pages = 50;		// 페이지 수 <-- 방법 1
	int price;
	
	Book(String title, int series) { // 생성자 1
		this.title = title;
		this.series = series;
//		pages = 50; // <-- 방법 2
	}
	
	Book(String title, int series, int pages) { // 생성자 2
		this(title, series); // <-- 생성자 1을 호출
		this.pages = pages;
	}	
	
	Book(String title, int series, int pages, int price) {
		this(title, series, pages); // <-- 생성자 2를 호출
		/*this.title = title;
		this.series = series;
		this.pages = pages;*/
		this.price = price;
	}
}
