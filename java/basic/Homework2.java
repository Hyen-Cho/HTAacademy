import java.util.Scanner;

public class Homework2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("### ����ǰ�������� ���α׷� ###");

		int grade = 0;
		int price = 0;
		int num = 0;
		int total = 0;
		boolean pass = false;

		System.out.println("����� �Է��Ͻÿ�");
		grade = scanner.nextInt();
		System.out.println("������ �Է��Ͻÿ�");
		price = scanner.nextInt();
		System.out.println("���ż����� �Է��Ͻÿ�");
		num = scanner.nextInt();

		total = price * num;
		pass = grade == 1 && total >= 1000000;

		System.out.println("��� : " + grade);
		System.out.println("���� : " + price);
		System.out.println("���ż��� : " + num);
		System.out.println("�ѱ��űݾ� : " + total);
		System.out.println("����ǰ�������� : " + pass);
		

	}
}