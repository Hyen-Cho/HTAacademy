import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("### �ѱ��ż��� ǥ�� ���α׷� ###");

		int price = 0;
		int num = 0;
		int total =0;

		System.out.println("������ �Է��Ͻÿ�");
		price = scanner.nextInt();
		System.out.println("���ż����� �Է��Ͻÿ�");
		num = scanner.nextInt();

		total = price * num;

		System.out.println("���� : " + price);
		System.out.println("���ż��� : " + num);
		System.out.println("�ѱ��Ű��� : " + total);
	}
}