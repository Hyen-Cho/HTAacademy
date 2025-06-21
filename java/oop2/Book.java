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
		System.out.println("번호 : " + no);
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
	}
}
