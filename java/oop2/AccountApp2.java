import java.util.Scanner;

public class AccountApp2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Account[] accounts = new Account[2];

		for (;;) {
			System.out.println("1.�Է� | 2.��ȸ | 3.�Ա� | 4.������� | 0.����");
			System.out.println();

			System.out.print("�޴� ����> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// ��ȣ, ������, ���, �ܾ��� �Է¹޾Ƽ�
				// Account��ü�� �����ϰ�(�Ű����� 4��¥�� ������ Ȱ��)
				// account �迭�� ���
				
				for (int i=0; i<2; i++) {
					System.out.print("���¹�ȣ�Է�> ");
					int num = scanner.nextInt();

					System.out.print("�������Է�> ");
					String name = scanner.next();

					System.out.print("����Է�> ");
					int passWord = scanner.nextInt();

					System.out.print("�ܾ��Է�> ");
					int balance = scanner.nextInt();

					Account a = new Account(num, name, passWord, balance);
					accounts[i] = a;
				}

			} else if (selectNo == 2) {

				for (Account acc : accounts) {
					acc.displayInfo();
				}			
			
			} else if (selectNo == 3) {
				System.out.print("��ȣ �Է�> ");
				int num = scanner.nextInt();
				System.out.print("�Ա��� �ݾ� �Է�> ");
				int price = scanner.nextInt();


			
			} else if (selectNo == 4) {
			
			} else if (selectNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println();
		}
	}
}