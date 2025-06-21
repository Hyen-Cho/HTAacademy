public class BookUtils {
	// Book��ü �ϳ��� ���޹޾Ƽ� å������ ����ϴ� ���
	void printBook (Book book) {
		System.out.println("��    �� : " + book.title);
		System.out.println("��    �� : " + book.writer);
		System.out.println("�� �� �� : " + book.publisher);
		System.out.println("��    �� : " + book.price);
		System.out.println("�� �� �� : " + book.publishDate);
		System.out.println("�Ǹſ��� : " + book.sell);
		System.out.println("--------------------------------");
	}


	// Book�迭�� ���޹޾Ƽ� ���� �Ǹ����� å�� ����ϴ� ���.
	void printBookForSell (Book[] books) {
		for (Book book : books) {
			if (book.sell) {
				printBook(book);		// ���� ��ü �ȿ��� �ٸ� �޼ҵ带 ����� �� �ִ�.
			}
		}
	}


	// Book�迭�� ���޹޾Ƽ� ���� �Ǹ������� ���� å�� ����ϴ� ���.
	void printBookForNonSell (Book[] books) {
		for (Book book : books) {
			if (!book.sell) {
				printBook(book);
			}
		}
	}


	// Book�迭�� ���޹޾Ƽ� ���� ��� å(Book)������ �����ϴ� ���
	Book getExpensiveBook(Book[] books) {
		Book expensiveBook = null;
		
		int expensivePrice = 0;
		for (Book book : books) {
			/*
				���� å�� ������ �ְ��ݺ��� ũ��
				�� å�� ������ �ְ��ݿ� �����ϰ�
				�� å ������ expensiveBook�� �����Ѵ�.
				�ݺ��� ������ �����ϸ� ���� ��� å�� expensiveBook�� �����ִ�.
			*/
			if (expensivePrice < book.price) {
				expensivePrice = book.price;
				expensiveBook = book;
			}
		}
		return expensiveBook;
	}
}
