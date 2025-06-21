public class Account {
	int no;			// ���¹�ȣ
	String owner;	// ������
	int balance;	// �ܾ�
	int password;	// ��й�ȣ

	Account(int newNo, String newOwner, int newPassword) {
		no = newNo;
		owner = newOwner;
		password = newPassword;
		balance = 0;
	}

	Account(int newNo, String newOwner, int newPassword, int newBalance) {
		no = newNo;
		owner = newOwner;
		password = newPassword;
		balance = newBalance;
	}

	void displayInfo() {
		System.out.println("���¹�ȣ : " + no);
		System.out.println("�� �� �� : " + owner);
		System.out.println("��й�ȣ : " + password);
		System.out.println("��    �� : " + balance);
		System.out.println();
	}

	// �Աݱ�� : �Աݾ��� ���޹޾Ƽ� �ܾ��� ������Ű�� ���
	void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�Աݾ��� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	
	// ��й�ȣ ������: ���� ��й�ȣ�� �� ��й�ȣ�� ���޹޾Ƽ� ��й�ȣ�� �����ϴ� ���
	// ���� ��й�ȣ�� ���� ��й�ȣ�� ��ġ�ϴٸ� ��й�ȣ ����
	// ��ġ���� ������ ȭ�鿡 �����޼��� ���
	void changePassword(int oldPassword, int newPassword) {
		if (password == oldPassword) {
			password = newPassword;
			System.out.println("��й�ȣ�� ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}
}