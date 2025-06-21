import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int accountNumbers = 0;			// ���¼�
		Account[] accounts = null;		// Account ��ü�� ��� �迭�� ���� �׸�
		int haveNum = 0;

		for (;;) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.���¼��Է�, 2.���������Է�, 3.�����������, 4.�Ա�, 5.���, 0.����");
			System.out.println("--------------------------------------------------------");

			System.out.print("�޴� ����> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("���� �ִ� ���� ����> ");
				haveNum = scanner.nextInt();
				accounts = new Account[haveNum];

			} else if (selectNo == 2) { 

				for (int i=0; i<haveNum; i++) {

					System.out.print("�����̸�> ");
					String iTitle = scanner.next();

					System.out.print("���¹�ȣ> ");
					int iNum = scanner.nextInt();

					System.out.print("��й�ȣ> ");
					int iPw = scanner.nextInt();

					System.out.print("�̸�> ");
					String iName = scanner.next();

					System.out.print("�ܾ�> ");
					int iBalance = scanner.nextInt();

					Account ac = new Account();
					ac.title = iTitle;
					ac.number = iNum;
					ac.password = iPw;
					ac.name = iName;
					ac.balance = iBalance;

					accounts[i] = ac; 

				}

			} else if (selectNo == 3) {
				
				for (Account x : accounts) {
				System.out.println("�����̸� : " + x.title);
				System.out.println("���¹�ȣ : " + x.number);
				System.out.println("�̸� : " + x.name);
				System.out.println("�ܾ� : " + x.balance);
				}

			} else if (selectNo == 4) {
			// �Էµ� ���¹�ȣ�� ��ġ�ϴ� ���������� ã��
			// �Էµ� ��й�ȣ�� ã���� ������ ��й�ȣ�� ��ġ�ϴ� ��쿡��
			// �Ա�/����� �ȴ�.

				System.out.println("[���� �Ա�]");

				System.out.print("���¹�ȣ �Է�> ");
				int no = scanner.nextInt();
				System.out.print("��й�ȣ �Է�> ");
				int password = scanner.nextInt();
				System.out.print("�� �� �� �Է�> ");
				int amount = scanner.nextInt();				

				boolean isSuccess = false;
				for (Account x : accounts) {
					if (x.number == no && x.password == password) {
						x.balance += amount;
						isSuccess =  true;
						break;
					}				
				}

				if (isSuccess) {
					System.out.println("�Ա�ó���� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("���¹�ȣ Ȥ�� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
				}


			} else if (selectNo == 5) {

				System.out.println("[���� �Ա�]");

				System.out.print("���¹�ȣ �Է�> ");
				int no = scanner.nextInt();
				System.out.print("��й�ȣ �Է�> ");
				int password = scanner.nextInt();
				System.out.print("�� �� �� �Է�> ");
				int amount = scanner.nextInt();		

				boolean isSuccess = false;
				for (Account x : accounts) {
					if (x.number == no && x.password == password) {
						x.balance -= amount;
						isSuccess = true;
						break;
					}
				}

				if (isSuccess) {
					System.out.println("���ó���� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("���¹�ȣ Ȥ�� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
				}

			} else if (selectNo == 0) {

				System.out.println("���α׷�����");
				break;
			}
			
		}
	}
}
