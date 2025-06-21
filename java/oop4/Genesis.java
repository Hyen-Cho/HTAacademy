public class Genesis extends Car {
	private int price;

	public Genesis() {
		//super();		<--- ��������, �ڵ����� �߰���
		System.out.println("Genesis() �����ڰ� �����");
	}

	// �θ��� �����ڸ� �ʵ��� �ʱ�ȭ�� Ȱ��
	public Genesis(String name, int speed, int price) {
		super(name, speed);			// �θ��� ������
		this.price = price;
		System.out.println("Genesis(String, int, int) ������ �����");
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void carInfo() {
		super.carInfo();	// �θ�Ŭ������ ���ǵ� carInfo() ȣ��
		System.out.println("��    �� : " + price);
	}
}