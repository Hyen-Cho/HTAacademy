import java.util.Scanner;

public class IfDemo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ��ǰ����, ���ż����� �Է¹޾Ƽ� �ѱ��Ű����� ����ϰ�
		// 50���� �̻� ���Ž� ���űݾ��� 5% ����(�ѱ��Ű���*5/100)
		// 30���� �̻� ���Ž� ���űݾ��� 2% ����(�ѱ��Ű���*2/100)
		// �� �� ���� ����

		// ��ǰ����, ���ż���, �ѱ��Ű���, ���ι��� �ݾ�, �������ұݾ��� ǥ���ϱ�

		// �׸� �����
		int price = 0;
		int amount = 0;
		int totalPrice = 0;
		int dcPrice = 0;
		int pay = 0;

		// �Է¹ޱ�
		System.out.println("��ǰ������ �Է��Ͻÿ�.");
		price = scanner.nextInt();
		System.out.println("���ż����� �Է��Ͻÿ�.");
		amount = scanner.nextInt();

		// ����ϱ�
		totalPrice = price * amount;
		
		// ���� �����
		if (totalPrice >= 500000) {
			dcPrice = totalPrice*5/100;
		} else if (totalPrice >= 300000) {
			dcPrice = totalPrice*2/100;
		}							// �� ���ϴ� ���� �����Ƿ� else ��� �ȴ�.
		
		pay = totalPrice - dcPrice;

		//����ϱ�
		System.out.println("�ѱ���  �ݾ� " + totalPrice);
		System.out.println("���ι����ݾ� " + dcPrice);
		System.out.println("�������ұݾ� " + pay);
	}
}
