import java.util.Scanner;

public class OpDemo10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("### ������ ��� ���α׷� ###");

		int year = 0;			// ���ų⵵�� ���� �׸�
		int distance = 0;		// ����Ÿ��� ���� �׸�
		boolean pay = false;	// ������� ���θ� ���� �׸�

		System.out.println("���ų⵵�� �Է��ϼ���");
		year = scanner.nextInt();
		System.out.println("����Ÿ��� �Է��ϼ���");
		distance = scanner.nextInt();

		// ���űⰣ�� 3���� �Ѱų� ����Ÿ��� 50000km�� �Ѵ� ��� ��������� �Ǵ�
		pay = (2019 - year) > 3 || distance > 50000;

		System.out.println("������� ���� " + pay);


	}
}
