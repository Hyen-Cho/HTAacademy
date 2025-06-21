public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.displayBookDetail();

		Book b2 = new Book(10, "이것이 자바다", "신용권", 30000);
		b2.displayBookDetail();

		Book b3 = new Book(30, "문제로 풀어보는 알고리즘", "홍인목", 28000);
		b3.displayBookDetail();

	}
}
