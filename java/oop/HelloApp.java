public class HelloApp {
	public static void main(String[] args) {
		
		// 1.
		Hello hello = new Hello();		// ��ü�� �����.
		hello.morning();				// �޼ҵ� ����(ȣ��)
		
		// 2.
		hello.greeting("�̼���");
		hello.greeting("������");
		
		// 3.
		hello.promise("õ����",5);
		hello.promise("�����",7);

		// �ٸ� ǥ��
		String username = "�����";
		hello.greeting(username);
	}
}
