public class ProductService {
	private Product[] database = new Product[10];	// ��ǰ��ü 10���� ��� �迭
	private int position = 0;						// ��ǰ��ü�� ��� ��ġ

	// ���ο� ��ǰ������ �迭�� �����ϴ� ���
	public void addProduct(Product product) {
		if (position < database.length) {
		database[position] = product;
		position++;
		}
	}

	// ��� ��ǰ������ ȭ�鿡 ����ϴ� ���
	public void printAllProducts() {
		for (Product p : database) {
			printProduct(p);

		}
	}

	// ���޹��� ������ �ش��ϴ� ��ǰ������ ȭ�鿡 ����ϴ� ���
	public void printProductIndex(int index) {

		Product p = database[index];
		printProduct(p);
	}

	// ���޹��� ��ǰ��ȣ�� �ش��ϴ� ��ǰ������ ����ϴ� ���
	public void printProductByNo(int productNo) {
		for (Product p : database) {
			if (p != null && p.getNo() == productNo) {
				printProduct(p);
			}
		}
	}

	public void printProduct(Product p) {
		if (p != null) {
			System.out.println("��ǰ��ȣ : " + p.getNo());
			System.out.println("��ǰ�̸� : " + p.getName());
			System.out.println("�� �� �� : " + p.getManufacturer());
			System.out.println("��ǰ���� : " + p.getPrice());
			System.out.println();
		}
	}
}
