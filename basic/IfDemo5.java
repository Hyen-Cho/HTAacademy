import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ��ǰ����, ��ǰ������ �Է¹޾Ƽ� �ѱ��Ű����� ǥ���ϰ�
		// �ѱ��Ű����� 50���� �̻��̸� 5���� ��ǰ��
		// �ѱ��Ű����� 30���� �̻��̸� 1���� ��ǰ��
		// �� �ܴ� 1�ð� ������������ �����ϴ� ���α׷�

		int price = 0;
		int amount = 0;
		int totalPrice = 0;

		System.out.println("��ǰ������ �Է��Ͻÿ�.");
		price = scanner.nextInt();
		System.out.println("��ǰ������ �Է��Ͻÿ�.");
		amount = scanner.nextInt();

		totalPrice = price*amount;

		if (totalPrice >= 500000) {
			System.out.println("5���� ��ǰ��");
		} else if (totalPrice >= 300000) {
			System.out.println("1���� ��ǰ��");
		} else {
			System.out.println("1�ð� ����������");
		}

		Strint gift = "";
		if (totalPrice >= 500000) {
			gift = "5���� ��ǰ��";
		} else if (totalPrice >= 300000) {
			gift = "3���� ��ǰ��";
		} else {
			gift = "���� ������";
		}

		System.out.println(gift + "�� �����մϴ�.");
	}
}
