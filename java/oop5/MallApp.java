import java.util.Scanner;

public class MallApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MallService mall = new MallService();

		for (;;) {
			System.out.println("1.ī�װ� ��� | 2.ī�װ� ��� | 3.��ǰ��� | 4.��ǰ��� | 5.ī�װ��� ��ǰ��� | 0.����");

			System.out.print("�޴� ����> ");
			int select = scanner.nextInt();

			if (select == 1) {
				// 1. ��ȣ�� �̸��� �Է¹޴´�.
				// 2. Category��ü�� �����Ѵ�.
				// 3. Category��ü�� setter�� ����ؼ� ���� �����Ѵ�.
				// 4. MallService(������ ������ mall������)�� addCategory�޼ҵ忡�� Category��ü�� �����Ѵ�.

				System.out.println("### ī�װ� ��� ###");

				System.out.print("ī�װ� ��ȣ �Է�> ");
				int no = scanner.nextInt();
				System.out.print("ī�װ� �̸� �Է�> ");
				String name = scanner.next();

				Category cat = new Category();
				cat.setNo(no);
				cat.setName(name);
				mall.addCategory(cat);
		
			} else if (select == 2) {
				// 1. MallService(������ ������ mall������)�� printAllCategories�޼ҵ带
				//		�����ؼ� ��� ī�װ� ������ ����Ѵ�.
				System.out.println("### ī�װ� ��� ###");

				mall.printAllCategories();
			
			} else if (select == 3) {
				/*
					1. ī�װ���ȣ, ��ǰ��ȣ, ��ǰ�̸�, ������ �Է¹޴´�.
					2. MallService(������ ������ mall������)�� getCategory�޼ҵ忡��
						1������ �Է¹��� ī�װ���ȣ�� �����ؼ� ��ȣ�� �ش��ϴ� Category�� �����޴´�.
					3. Product��ü�� �����Ѵ�.
					4. Product��ü�� setter�� ����ؼ� ��ǰ��ȣ, �̸�, ����,
						2������ ȹ���� Category��ü�� �����Ѵ�.
					5. MallService(������ ������ mall������)�� addProduct�޼ҵ忡�� Product��ü�� �����Ѵ�.
				*/
				System.out.println("### ��ǰ��� ###");

				System.out.print("��ǰ��ȣ �Է�> ");
				int no = scanner.nextInt();
				System.out.print("��ǰ�̸� �Է�> ");
				String name = scanner.next();
				System.out.print("��ǰ���� �Է�> ");
			
				int price =  scanner.nextInt();
				System.out.print("ī�װ���ȣ �Է�> ");
				int catNo = scanner.nextInt();


				Category c = mall.getCategory(catNo);

				Product p = new Product();
				p.setNo(no);
				p.setName(name);
				p.setPrice(price);
				p.setCat(c);

				mall.addProduct(p);
				
			
			} else if (select == 4) {
				System.out.println("### ����� ��ǰ ���");

				mall.printAllProducts();
			
			} else if (select == 5) {
				System.out.println("### ī�װ��� ��ǰ ���");

				System.out.print("ī�װ� ��ȣ �Է�> ");
				int no = scanner.nextInt();

				mall.printProductsByCategory(no);
			
			} else if (select == 0) {
				System.out.println("���α׷�����");
				break;
			}
		}
	}
}