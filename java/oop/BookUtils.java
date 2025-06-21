public class BookUtils {
	// Book객체 하나를 전달받아서 책정보를 출력하는 기능
	void printBook (Book book) {
		System.out.println("제    목 : " + book.title);
		System.out.println("저    자 : " + book.writer);
		System.out.println("출 판 사 : " + book.publisher);
		System.out.println("가    격 : " + book.price);
		System.out.println("출 판 일 : " + book.publishDate);
		System.out.println("판매여부 : " + book.sell);
		System.out.println("--------------------------------");
	}


	// Book배열을 전달받아서 현재 판매중인 책만 출력하는 기능.
	void printBookForSell (Book[] books) {
		for (Book book : books) {
			if (book.sell) {
				printBook(book);		// 같은 객체 안에서 다른 메소드를 사용할 수 있다.
			}
		}
	}


	// Book배열을 전달받아서 현재 판매중이지 않은 책만 출력하는 기능.
	void printBookForNonSell (Book[] books) {
		for (Book book : books) {
			if (!book.sell) {
				printBook(book);
			}
		}
	}


	// Book배열을 전달받아서 가장 비싼 책(Book)정보를 제공하는 기능
	Book getExpensiveBook(Book[] books) {
		Book expensiveBook = null;
		
		int expensivePrice = 0;
		for (Book book : books) {
			/*
				꺼낸 책의 가격이 최고가격보다 크면
				그 책의 가격을 최고가격에 대입하고
				그 책 가격을 expensiveBook에 대입한다.
				반복을 끝까지 수행하면 가장 비싼 책이 expensiveBook에 남아있다.
			*/
			if (expensivePrice < book.price) {
				expensivePrice = book.price;
				expensiveBook = book;
			}
		}
		return expensiveBook;
	}
}
