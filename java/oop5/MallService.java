public class MallService {
	private Category[] categories = new Category[10];
	private Product[] products = new Product[100];

	private int catPosition = 0;
	private int proPosition = 0;

	public MallService() {
		categories[catPosition++] = new Category(100, "����");
		categories[catPosition++] = new Category(200, "������ǰ");
		categories[catPosition++] = new Category(300, "�ֹ��ǰ");
	}

	// ���ο� ī�װ� ��ϱ��
	/*
		1. ���޹��� Category��ü�� categories �迭�� �����Ѵ�.
		 * �迭�� �����ϱ� ---> �迭��[��ġ] = ��;
		 * ����Ǵ� �迭�� ��ġ�� catPosition���� �����Ѵ�.
		2. ������ ����� Category��ü�� ���ؼ� catPosition�� ���� 1 ������Ų��.
	*/

	public void addCategory(Category category) {
		if (catPosition < categories.length) {
			categories[catPosition] = category;
			catPosition++;
		}
	}

	public Category getCategory(int categoryNo) {
		/*
			1. ������ Category��ü�� ���� ������ �̸� �����.
			2. �迭�� �� ��Ҹ� �ϳ��� �����Ѵ�.	<--- enhanced-for�� ���
			3. ������ Category��ü�� null�� �ƴϰ� ������ ��ü�� ��ȣ��
				���޹��� ī�װ���ȣ�� ��ġ�ϸ� ������ ��ü�� 1������ ������ ������ ��´�.
			4. return���� �̿��ؼ� ���� ����(��ȯ)�Ѵ�.
		*/
		Category category = null;
		
		for (Category cat : categories) {
			if (cat != null && cat.getNo() == categoryNo) {
				category = cat;
			}
		}

		return category;
	}

	public void addProduct(Product product) {
		if (proPosition < products.length) {
			products[proPosition] = product;
			proPosition++;
		}
	
	}

	public void printAllCategories() {
		for (Category c : categories) {
			if (c != null) {
				System.out.println("ī�װ� ��ȣ : " + c.getNo());
				System.out.println("ī�װ� �̸� : " + c.getName());
			}
		}
	
	}

	public void printAllProducts() {
		for (Product p : products) {
			if (p != null) {
				p.printDetail();
			}
		}
	}

	public void printProductsByCategory(int categoryNo) {
		for (Product p : products) {
			if (p != null) {
			Category c = p.getCat();
			
				if (c.getNo() == categoryNo) {
				p.printDetail();
				}
			}

			/*	�ٸ����
			if (p != null && p.getCat().getNo() == categoryNo) {
				p.printDetail();
			}
			*/
		}
	}
}