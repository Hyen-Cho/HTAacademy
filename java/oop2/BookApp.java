public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.displayBookDetail();

		Book b2 = new Book(10, "�̰��� �ڹٴ�", "�ſ��", 30000);
		b2.displayBookDetail();

		Book b3 = new Book(30, "������ Ǯ��� �˰���", "ȫ�θ�", 28000);
		b3.displayBookDetail();

	}
}
