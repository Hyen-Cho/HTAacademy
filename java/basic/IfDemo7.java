import java.util.Scanner;

public class IfDemo7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ��ǰ����, ���ż���, ���� ����Ʈ�� �Է¹޴´�.
		// 50���� �̻� ���Ž� ���űݾ��� 5% ����(�ѱ��Ű���*5/100)
		// 30���� �̻� ���Ž� ���űݾ��� 2% ����(�ѱ��Ű���*2/100)

		// ���� ����Ʈ�� 10000�� �̻��� ���� �������ұݾ��� 0.3%�� ����Ʈ�� ����
		// ���� ����Ʈ�� 5000�� �̻��� ���� �������ұݾ��� 0.2%�� ����Ʈ�� ����
		// �� �� 0.1%�� ����Ʈ�� ����

		// ��ǰ����, ���ż���, �� ���Ű���, ���ι����ݾ�, �������ұݾ��� ǥ��
		// ������ ����Ʈ, ����Ʈ������, ������ ����Ʈ

		
		int price = 0;
		int amount = 0;
		int totalPrice = 0;
		int discountPrice = 0;
		int payPrice = 0;
		
		int currentPoint = 0;
		int point = 0;
		int savedPoint = 0;

		System.out.println("��ǰ������ �Է��Ͻÿ�.");
		price = scanner.nextInt();
		System.out.println("���ż����� �Է��Ͻÿ�.");
		amount = scanner.nextInt();
		System.out.println("���� ����Ʈ�� �Է½ÿ�.");
		currentPoint = scanner.nextInt();

		totalPrice = price * amount;			// �ѱ��űݾ�: ���� * ����
		
		if (totalPrice >= 500000) {				// �ѱ��űݾ��� 50���� �̻��϶�
			discountPrice = totalPrice*5/100;	// ���αݾ�: �ѱݾ�*5/100
		} else if(totalPrice >= 300000) {		// �ѱ��űݾ��� 50���� �̻��϶�
			discountPrice = totalPrice*2/100;	// ���αݾ�: �ѱݾ�*2/100
		}

		payPrice = totalPrice - discountPrice;	// �������ұݾ�: �ѱ��űݾ� - ���αݾ�

		if (currentPoint >= 10000) {			// ��������Ʈ�� 10000�� �̻��� ��
			point = payPrice*3/1000;			// ����Ʈ������: �������ұݾ�*3/1000
		} else if (currentPoint >= 5000) {		// ��������Ʈ�� 5000�� �̻��� ��
			point = payPrice*2/1000;			// ����Ʈ������: �������ұݾ�*2/1000
		} else {								// �� �ܿ���
			point = payPrice*1/1000;			// ����Ʈ������: �������ұݾ�*1/1000
		}

		savedPoint = currentPoint + point;		// ����������Ʈ: ��������Ʈ + ����Ʈ������

		System.out.println("��ǰ���� " + price);
		System.out.println("���ż��� " + amount);
		System.out.println("�ѱ��Ű��� " + totalPrice);
		System.out.println("���ι��� �ݾ� " + discountPrice);
		System.out.println("�������ұݾ� " + payPrice);
		System.out.println("������ ����Ʈ " + currentPoint);
		System.out.println("����Ʈ������ " + point);
		System.out.println("������ ����Ʈ " + savedPoint);
			
	}
}