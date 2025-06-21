public class AccountApp {
	public static void main(String[] args) {
	
		Account.AccountBuilder builder = new Account.AccountBuilder();

		builder.no(10).name("ȫ�浿");		// �޼ҵ� ü�̴�(��return this;)
		Account account1 = builder.build();
		System.out.println("��ȣ : " + account1.getNo());
		System.out.println("�̸� : " + account1.getName());
		System.out.println("�ܾ� : " + account1.getBalance());

		builder.no(20).balance(230000);
		Account account2 = builder.build();
		System.out.println("��ȣ : " + account2.getNo());
		System.out.println("�̸� : " + account2.getName());
		System.out.println("�ܾ� : " + account2.getBalance());

		builder.no(40).name("������").balance(430000);
		Account account3 = builder.build();
		System.out.println("��ȣ : " + account3.getNo());
		System.out.println("�̸� : " + account3.getName());
		System.out.println("�ܾ� : " + account3.getBalance());

		Account account4 = builder.no(50).name("������").balance(5000000).build();
		System.out.println("��ȣ : " + account4.getNo());
		System.out.println("�̸� : " + account4.getName());
		System.out.println("�ܾ� : " + account4.getBalance());
	}
}
