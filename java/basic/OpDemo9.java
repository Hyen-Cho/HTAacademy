import java.util.Scanner;		// ���� �������� ����� ���� Scanner ��� ���α׷�

public class OpDemo9 {
	public static void main(String[] args) {

		// Ű���� �Է��� �о���� ��ü �����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("### �հݿ��� �Ǵ� ���α׷� ###");
		
		// �׸� ����� ��
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = 0;			// ������ ��� �׸�
		int avg = 0;			// ��������� ��� �׸�
		boolean pass = false;	// �հݿ��θ� ��� �׸�

		// �Է� �޴� ��
		System.out.println("���������� �Է��ϼ���");
		kor = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		math = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		eng = scanner.nextInt();

		// ���
		total = kor + math + eng;
		avg = total/3;
		pass = avg >= 60;

		// ���
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + math);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + total);
		System.out.println("������� : " + avg);
		System.out.println("�հݿ��� : " + pass);
	}
}