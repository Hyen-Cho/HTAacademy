public class Book {
	int no;
	String title;
	String writer;
	int price;

	Book() {
	
	}

	Book(int no, String title, String writer, int price) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	void displayBookDetail() {
		System.out.println("��ȣ : " + no);
		System.out.println("���� : " + title);
		System.out.println("���� : " + writer);
		System.out.println("���� : " + price);
	}
}
