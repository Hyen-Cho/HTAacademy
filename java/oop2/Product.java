// ��ǰ��ȣ, ��ǰ�̸�, ������, ��ǰ������ ������ ��� ��ü�� ���� ���赵
public class Product {
	// ������� �ʵ� ����
	private int no;
	private String name;
	private String manufacturer;
	private int price;

	// �⺻ ������ ����
	public Product () {}

	// Getter/Setter �޼ҵ� ����
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