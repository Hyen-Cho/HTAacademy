public class BookApp {
	public static void main(String[] args) {
		// Book ��ü ���� �� å���� ���� �� ����ϱ�

		Book c1 = new Book();
		Book c2 = new Book();
		
		c1.title = "�̰��� �ڹٴ�";
		c1.writer = "�ſ��";
		c1.publisher = "�Ѻ��̵��";
		c1.price = 30000;
		c1.publishDate = "2015�� 1�� 5��";
		c1.sell = true;

		c2.title = "���� ��������Ʈ ��ũ��";
		c2.writer = "���Ͽ�";
		c2.publisher = "�Ѻ��̵��";
		c2.price = 28000;
		c2.publishDate = "2019�� 2�� 10��";
		c2.sell = true;
		
		BookPrinter printer = new BookPrinter();
		printer.displayBook(c1);
		printer.displayBook(c2);

		/*
		System.out.println("���� : " + c1.title);
		System.out.println("���� : " + c1.writer);
		System.out.println("���ǻ� : " + c1.publisher);
		System.out.println("���� : " + c1.price);
		System.out.println("������ : " + c1.publishDate);
		System.out.println("�Ǹſ��� : " + c1.sell);
		*/


	}
}
