import java.util.Scanner;

public class ForDemo11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ������ ���� �����
		int number = (int) (Math.random()*20 + 1);

		// ���ڸ� �Է¹޾Ƽ� ������ ���ڿ� ��ġ�ϴ��� �˾Ƴ���
		// ������ ����: number, �Է¹��� ����: a
		
		for (;;) {
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int a = scanner.nextInt();

			if (number > a) {
				System.out.println("ũ��");
			} else if (number < a) {
				System.out.println("�۴�");
			} 

			if (number == a ) {
				System.out.println("����");
				break;
			}

			// ����ڷκ��� ���ڸ� �Է¹޴´�.
			// �Է¹��� ���ڰ� number�� ����ִ� ������
			// ũ�ٸ� "ũ��"�� ����ϰ�, �۴ٸ� "�۴�"�� ����Ѵ�.
			// �Է¹��� ���ڰ� number�� ��ġ�ϸ� �ݺ����� Ż���Ѵ�.
		}

		System.out.println("������ ���� : " + number);
	}
}
