import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int productNumbers = 0;				// ���� ���� �׸�
		String[] productNames = null;		// �迭 ���̰� ����� �𸣴� ��ǰ �̸�
		int[] productPrices = null;			// �迭 ���̰� ����� �𸣴� ��ǰ ����
		int total = 0;						// �հ�
		
		for (;;) {
			System.out.println("------------------------------------------------------------");
			System.out.println(" 1.��ü ���� | 2.���Ż�ǰ���� �Է� | 3.������ ��� | 0.����");
			System.out.println("------------------------------------------------------------");

			System.out.print("�޴�����> ");
			int selectNo = scanner.nextInt();

			/*
				��ü ��ǰ������ �Է¹޴´�.
				��ü ��ǰ������ŭ ��ǰ�̸��� ��� �迭��, ��ǰ������ ��� �迭�� �����Ѵ�.
			*/
			if (selectNo == 1) {
				System.out.print("��ǰ������ ����> ");
				productNumbers = scanner.nextInt();				// ���Ű���
				productNames = new String[productNumbers];		// productNames�� productNumbers ������ŭ �迭���̸� �����.
				productPrices = new int[productNumbers];		// productPrices�� productNumbers ������ŭ �迭���̸� �����.

			/*
				��ü ��ǰ������ŭ ��ǰ�̸��� ��ǰ������ �Է¹޴� �۾��� �ݺ��Ѵ�.
				��ǰ�̸��� ��ǰ������ ���� �Է¹޾Ƽ� �ش� �迭�� ������� �����Ѵ�.
			*/

			} else if (selectNo == 2) {

				for (int i=0; i<productNumbers; i++) {					// ���Ű�����ŭ 1�� �����ϴ� ���� �ݺ��Ѵ�.
					System.out.print("["+i+"]��° ��ǰ�̸� �Է�> ");
					String productName = scanner.next();
					productNames[i] = productName;						// ��ǰ�̸��� i��° ���� i��°�� �Է��� ��ǰ�̸��̴�.

					System.out.print("["+i+"]��° ��ǰ���� �Է�> ");
					int price = scanner.nextInt();
					productPrices[i] = price;							// ��ǰ������ i��° ���� i��°�� �Է��� �����̴�.
					
				}
			
			for (int price : productPrices) {
				total = total + price;
			}

			/*
				��ü ��ǰ�̸��� ��ǰ������ ȭ�鿡 ����Ѵ�.(enhanced-for�� ���ȵ�)
			*/

			} else if (selectNo == 3) {
				System.out.println("���Ż�ǰ ����Ʈ");
				System.out.println("------------------------------------------");
				System.out.println(productNames[0] + "\t\t" + productPrices[0]);
				System.out.println(productNames[1] + "\t\t" + productPrices[1]);
				System.out.println(productNames[2] + "\t\t" + productPrices[2]);
				System.out.println("------------------------------------------");
				System.out.println("�հ�" + total);
			
				
			} else if (selectNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}


		}
	}
}