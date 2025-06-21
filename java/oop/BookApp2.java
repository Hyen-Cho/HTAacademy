public class BookApp2 {
	public static void main(String[] args) {
		
		Book[] books = new Book[3];

		Book book1 = new Book();

		book1.title = "이것이 자바다";
		book1.writer = "신용권";
		book1.publisher = "한빛미디어";
		book1.price = 30000;
		book1.publishDate = "2015년 1월 5일";
		book1.sell = true;

		Book book2 = new Book();

		book2.title = "실전 스프링부트 워크북";
		book2.writer = "이일용";
		book2.publisher = "한빛미디어";
		book2.price = 28000;
		book2.publishDate = "2019년 2월 10일";
		book2.sell = false;

		Book book3 = new Book();

		book3.title = "정보처리산업기사 필기";
		book3.writer = "홍봉선";
		book3.publisher = "길벗";
		book3.price = 31000;
		book3.publishDate = "2017년 11월 20일";
		book3.sell = true;

		books[0] = book1;
		books[1] = book2;
		books[2] = book3;

		BookUtils util = new BookUtils();

		System.out.println("---- 책정보 출력 기능 -----");
		util.printBook(book1);
		util.printBook(book2);
		util.printBook(book3);

		System.out.println("---- 판매하는 책 출력 기능 -----");
		util.printBookForSell(books);

		System.out.println("---- 가장 비싼책 획득하기 -----");
		Book b = util.getExpensiveBook(books);
		util.printBook(b);
	}
}
