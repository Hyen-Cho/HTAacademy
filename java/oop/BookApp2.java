public class BookApp2 {
	public static void main(String[] args) {
		
		Book[] books = new Book[3];

		Book book1 = new Book();

		book1.title = "�̰��� �ڹٴ�";
		book1.writer = "�ſ��";
		book1.publisher = "�Ѻ��̵��";
		book1.price = 30000;
		book1.publishDate = "2015�� 1�� 5��";
		book1.sell = true;

		Book book2 = new Book();

		book2.title = "���� ��������Ʈ ��ũ��";
		book2.writer = "���Ͽ�";
		book2.publisher = "�Ѻ��̵��";
		book2.price = 28000;
		book2.publishDate = "2019�� 2�� 10��";
		book2.sell = false;

		Book book3 = new Book();

		book3.title = "����ó�������� �ʱ�";
		book3.writer = "ȫ����";
		book3.publisher = "���";
		book3.price = 31000;
		book3.publishDate = "2017�� 11�� 20��";
		book3.sell = true;

		books[0] = book1;
		books[1] = book2;
		books[2] = book3;

		BookUtils util = new BookUtils();

		System.out.println("---- å���� ��� ��� -----");
		util.printBook(book1);
		util.printBook(book2);
		util.printBook(book3);

		System.out.println("---- �Ǹ��ϴ� å ��� ��� -----");
		util.printBookForSell(books);

		System.out.println("---- ���� ���å ȹ���ϱ� -----");
		Book b = util.getExpensiveBook(books);
		util.printBook(b);
	}
}
