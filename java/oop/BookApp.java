public class BookApp {
	public static void main(String[] args) {
		// Book 객체 생성 후 책정보 저장 및 출력하기

		Book c1 = new Book();
		Book c2 = new Book();
		
		c1.title = "이것이 자바다";
		c1.writer = "신용권";
		c1.publisher = "한빛미디어";
		c1.price = 30000;
		c1.publishDate = "2015년 1월 5일";
		c1.sell = true;

		c2.title = "실전 스프링부트 워크북";
		c2.writer = "이일용";
		c2.publisher = "한빛미디어";
		c2.price = 28000;
		c2.publishDate = "2019년 2월 10일";
		c2.sell = true;
		
		BookPrinter printer = new BookPrinter();
		printer.displayBook(c1);
		printer.displayBook(c2);

		/*
		System.out.println("제목 : " + c1.title);
		System.out.println("저자 : " + c1.writer);
		System.out.println("출판사 : " + c1.publisher);
		System.out.println("가격 : " + c1.price);
		System.out.println("출판일 : " + c1.publishDate);
		System.out.println("판매여부 : " + c1.sell);
		*/


	}
}
