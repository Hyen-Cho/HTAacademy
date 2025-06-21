public class Book {
	private int no;
	private String name;
	private int price;

	public Book() {}

	public Book(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	// Getter, Setter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}