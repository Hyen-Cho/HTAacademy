import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ����, ����, ���� ������ �Է¹޾Ƽ�
		// ����� 70�� �̻��̸� �հ�, �� �ܴ� ���հ����� ǥ���ϴ� ���α׷�

		System.out.println("### �հ�,���հ��� ǥ���ϴ� ���α׷� ###");

		int kor = 0;
		int eng = 0;
		int math = 0;
		int avg = 0;

		System.out.println("���� ������ �Է��Ͻÿ�.");
		kor = scanner.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		eng = scanner.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�.");
		math = scanner.nextInt();

		avg = (kor + eng + math)/3;

		if (avg >= 70) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		
		
		String result = "";
		if (avg >= 70) {
			result = "�հ�";
		} else {
			result = "���հ�";
		}

		System.out.println("�հݿ��� " + result);
		
	}
}
