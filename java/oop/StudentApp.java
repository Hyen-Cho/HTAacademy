import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int studentNumbers = 0;			// �л� ���� ���� ����
		Student[] students = null;		// ���� ���� �л������� ��� �迭�� �����ؼ� ���� ����

		for (;;) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(" 1.�л��� �Է� | 2.�л����� �Է� | 3.��ü ��� | 4.�� �л� ��� | 0.����");
			System.out.println("--------------------------------------------------------------------------");

			System.out.print("�޴� ����> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// �л����� �Է¹޴´�.
				// �л� �� ��ŭ�� �л������� ��� �迭�� �����ؼ� ���� ������ ������ �����Ѵ�.
				System.out.print("�л���> ");
				studentNumbers = scanner.nextInt();	
				students = new Student[studentNumbers];
			
			} else if (selectNo == 2) {
				// �л� ����ŭ �й�, �̸�, ����, ����, ���������� �ݺ��ؼ� �Է¹޴´�.
				// Student��ü�� �����ؼ� �л������� �����Ѵ�.
				// �л������� ����� Student��ü�� �迭�� ������� �����Ѵ�.

				for (int i=0; i<studentNumbers; i++) {
					System.out.print("�л���ȣ> ");
					int sNum = scanner.nextInt();

					System.out.print("�̸�> ");
					String sName = scanner.next();

					System.out.print("���� ����> ");
					int sKor = scanner.nextInt();

					System.out.print("���� ����> ");
					int sEng = scanner.nextInt();

					System.out.print("���� ����> ");
					int sMath = scanner.nextInt();

					Student info = new Student();
					info.number = sNum;
					info.name = sName;
					info.kor = sKor;
					info.eng = sEng;
					info.math = sMath;

					students[i] = info;

				}

			} else if (selectNo == 3) {
				// ��� �л������� ����Ѵ�.
			
				for (Student x : students) {

					System.out.println(x.number + "\t" + x.name + "\t" + x.kor + "\t" + x.eng + "\t" + x.math);
				}

			} else if (selectNo == 4) {
				// ��ȸ�� �л��� �й��� �Է¹޴´�.
				// �л������� ����� �迭���� �Էµ� �й��� �ش��ϴ� �л��� ã�Ƽ� ����Ѵ�.

				System.out.print("��ȸ�� �л� ��ȣ> ");
				int num = scanner.nextInt();

				Student student = null;
				for (Student x : students) {
					if (x.number == num) {
						student = x;
						System.out.println(x.number + "\t" + x.name + "\t" + x.kor + "\t" + x.eng + "\t" + x.math);
						break;		// �ݺ��� �ʿ䰡 ������... �ڽŰ� ���� ������ �ִ� for���� Ż��.
						
					}
				}

				if (student != null) {
					System.out.println(student.no + "\t" + student.name);
				} else {
					System.out.println("�л����� ����");
				}


							
			} else if (selectNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}