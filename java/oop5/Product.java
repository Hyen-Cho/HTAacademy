public class Product {
	private int no;
	private String name;
	private int price;
	private Category cat;

	// 기본 생성자
	public Product() {
	
	}

	// Getter/Setter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public Category getCat() {
		return cat;
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
	public void setCat(Category Cat) {
		this.cat = cat;
	}

	public void printDetail() {
		System.out.println("상  품  번  호: " + no);
		System.out.println("1");
		System.out.println("상  품  이  름: " + name);
		System.out.println("2");
		System.out.println("상  품  가  격: " + price);
		System.out.println("3");
		System.out.println("카테고리  번호: " + cat.getNo());
		System.out.println("4");
		System.out.println("카테고리  이름: " + cat.getName());
		System.out.println();
	}
}