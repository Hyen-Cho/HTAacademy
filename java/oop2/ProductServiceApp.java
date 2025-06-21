import java.util.Scanner;

public class ProductServiceApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ��ǰ���� ����/���/��ȸ ����� �����ϴ� ��ü�� �����Ѵ�.
		// �Ʒ��� �� ���ø޴������� ProductService ��ü�� ����� Ȱ���Ѵ�.
		ProductService service = new ProductService();

		for (;;) {
			System.out.println("1.��ǰ��� | 2.��ü��ǰ ��� | 3.������ ��ǰ ��� | 4.��ǰ��ȣ�� ��� | 0.����");
			
			System.out.print("�޴� ����> ");
			int menuNo = scanner.nextInt();

			if (menuNo == 1) {
					
				/*
				 1.��ǰ������ �Է¹޴´�.
				 2.Product ��ü�� �����Ѵ�.
				 3.�Է¹��� ��ǰ������ Product�� ��´�.
				 4.������ ������ ProductService�� addProduct(Product product) �޼ҵ带 �����ؼ�
				   ��ǰ������ ��� �ִ� Product�� �迭�� ����ǰ� �Ѵ�.
				 */
				
				for (int i=0; i<10; i++) {
					System.out.print("��ǰ��ȣ> ");
					int no = scanner.nextInt();

					System.out.print("��ǰ�̸�> ");
					String name = scanner.next();

					System.out.print("�� �� ��> ");
					String manufacturer = scanner.next();

					System.out.print("��ǰ����> ");
					int price = scanner.nextInt();

					// ��ǰ������ ��� Product��ü�� �����ϰ�, setter�� Ȱ���ؼ� �ʵ忡 ���� �����ϱ�
					Product product = new Product();
					product.setNo(no);
					product.setName(name);
					product.setManufacturer(manufacturer);
					product.setPrice(price);

					// ProductService��ü�� �����ϴ� ��ǰ������ �迭�� �����ϴ� ����� �����ϱ�
					service.addProduct(product);

				}					 
			
			} else if (menuNo == 2) {
				System.out.println("[��ü ��ǰ���� ���]");
				service.printAllProducts();
				
			
			} else if (menuNo == 3) {
				System.out.println("[������ �ε����� ��ǰ���� ���]");
				System.out.print("�ε��� �Է�> ");
				int no = scanner.nextInt();

				service.printProductIndex(no);
			
			} else if (menuNo == 4) {
				System.out.println("[������ ��ǰ��ȣ ��ǰ���� ���]");
				System.out.print("��ǰ����> ");
				int no = scanner.nextInt();
			
				service.printProductByNo(no);

			} else if (menuNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println();
		}
	}
}
