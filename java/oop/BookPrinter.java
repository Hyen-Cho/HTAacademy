public class BookPrinter {

	// 책의 많은 정보를 Book 객체를 사용해서 한번에 book에 주소값을 담는다.
	void displayBook(Book book) {				
		System.out.println("제    목 : " + book.title);
		System.out.println("저    자 : " + book.writer);
		System.out.println("출 판 사 : " + book.publisher);
		System.out.println("가    격 : " + book.price);
		System.out.println("출 판 일 : " + book.publishDate);
		System.out.println("판매여부 : " + book.sell);
		System.out.println("-------------------------------------");		
	}
}
