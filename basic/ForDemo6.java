import java.util.Scanner;

public class ForDemo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int giftCard = 0;
		int totalPrice = 0;
		int price = 0;

		// ���� ���� ��ǰ������ �Է¹޾Ƽ�, ���űݾ��� ��ǰ�ǰ����� �ʰ��ϸ�
		// �����Է��� �����ϰ�, ���� �� ���űݾ��� ����ϱ�

		// �Է¹ޱ�
		System.out.println("��ǰ�� ������ ��ĵ�ϼ���");
		giftCard = scanner.nextInt();

		for (;;) {												// ���ѷ���

			// ���๮
			if (totalPrice <= giftCard) {			// �ѱݾ��� ��ǰ�ǰ��ݺ��� ���ϸ�
				System.out.println("��ǰ�� ��ĵ�ϼ���");		// �Է¹ޱ�
				price = scanner.nextInt();
				totalPrice = totalPrice + price;				// �ѱݾ� ����

			} else {											// �ʰ��ϸ�
				break;											// ����
			}

		}

		System.out.println("���űݾ�: " + totalPrice);
	}
}
