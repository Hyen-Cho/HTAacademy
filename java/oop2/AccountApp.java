public class AccountApp {
	public static void main(String[] args) {
		
		// ��ü ���� �� Account(int, String, int) ������ �޼ҵ带 �����ض�
		Account a1 = new Account(10, "ȫ�浿", 1234);
		a1.displayInfo();
		

		// ��ü ���� �� Account(int, String, int, int) ������ �޼ҵ带 �����ض�
		Account a2 = new Account(30, "�̼���", 5678, 300000);
		a2.displayInfo();

		// �Ա��ϱ�
		a1.deposit(10000);
		a1.displayInfo();

		a2.deposit(5000);
		a2.displayInfo();

		// ��й�ȣ �ٲٱ�
		a1.changePassword(1234,4321);
		a1.displayInfo();
	}
}
