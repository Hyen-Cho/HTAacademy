import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int studentNumbers = 0;			// �л���
		int[] scores = null;			/* ������ �����ϴ� �迭.
										���������� �̸� ���� ������ �� ���� �� null �Է� */
		
		for (;;) {
			System.out.println("--------------------------------------------------------");
			System.out.println(" 1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 0.����");
			System.out.println("--------------------------------------------------------");

			System.out.print("����> ");
			int selecteNo = scanner.nextInt();

			if (selecteNo == 1) {
				System.out.print("�л���> ");
				studentNumbers = scanner.nextInt();
				scores = new int[studentNumbers];		
				/* �Էµ� �л��� ��ŭ�� ũ�⸦ ������
				�迭�� �����ؼ� scores�� �� �ּҸ� ��´�*/

			} else if (selecteNo == 2) {
				for (int i=0; i<studentNumbers; i++) {
					System.out.print("["+i+"]��° �����Է�> ");
					int score = scanner.nextInt();
					scores[i] = score;			
					// score�� �Է��� ���� scores�� i��° ���� ä������.

				}
			} else if (selecteNo == 3) {
				for (int score : scores ) {	
					// scores �� ����ִ� ���� ������� ����Ѵ�.

					System.out.print(score + " ");
				}
				
			} else if (selecteNo == 4) {
				int total = 0;
				int highScore = 0;
				for (int score : scores) {
					total = total + score;
					if (score > highScore) {
						highScore = score;
					}
				}
				System.out.println("�ְ�����: " + highScore);
				System.out.println("��    ��: " + total);
				System.out.println("��    ��: " + total/studentNumbers);
			
			} else if (selecteNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
			System.out.println("\n\n\n");
	
		}
	}
}