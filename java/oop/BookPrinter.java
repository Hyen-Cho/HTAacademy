public class BookPrinter {

	// å�� ���� ������ Book ��ü�� ����ؼ� �ѹ��� book�� �ּҰ��� ��´�.
	void displayBook(Book book) {				
		System.out.println("��    �� : " + book.title);
		System.out.println("��    �� : " + book.writer);
		System.out.println("�� �� �� : " + book.publisher);
		System.out.println("��    �� : " + book.price);
		System.out.println("�� �� �� : " + book.publishDate);
		System.out.println("�Ǹſ��� : " + book.sell);
		System.out.println("-------------------------------------");		
	}
}
