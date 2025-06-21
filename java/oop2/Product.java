// 상품번호, 상품이름, 제조사, 상품가격을 정보를 담는 객체를 위한 설계도
public class Product {
	// 비공개된 필드 정의
	private int no;
	private String name;
	private String manufacturer;
	private int price;

	// 기본 생성자 정의
	public Product () {}

	// Getter/Setter 메소드 정의
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getManufacturer() {
		return manufacturer;
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

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}