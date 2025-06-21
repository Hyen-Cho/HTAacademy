import java.util.Scanner;

public class ItemApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Item[] cart = new Item[3];		// Item ��ü�� 3�� ���� �� �ִ� ����� cart �迭�� ����ڴ�.

		for (;;) {
			System.out.println("------------------------------------");
			System.out.println(" 1.�Է� | 2.��� | 0.����");
			System.out.println("------------------------------------");

			System.out.print("����> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
					
				for (int i=0; i<3; i++) {
					System.out.print("��ǰ�� �Է�> ");
					String productName = scanner.next();
					System.out.print("���� �Է�> ");
					int productAmount = scanner.nextInt();
					System.out.print("��ǰ���� �Է�> ");
					int productPrice = scanner.nextInt();

					Item item = new Item();		// ��ǰ���� ����� Item ��ü ����
					item.name = productName;
					item.amount = productAmount;
					item.price = productPrice;

					cart[i] = item;				// �迭�� item ��ü�� ���

				}

			} else if (selectNo == 2) {
				for (Item x : cart) {
					System.out.println(x.name + "\t" + x.amount + "\t" + x.price);
					
				}
			
			} else if (selectNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
	
}
