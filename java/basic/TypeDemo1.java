public class TypeDemo1 {
	public static void main(String[] args) {
		// ����Ÿ��: byte, short, int, long
		
		// byte b = 1000;	�ش� Ÿ���� ���� �� �ִ� ���� ������ �ʰ��ϴ� ���� ������ �� ����.

		// lingŸ���� ������ ���� ���� ���� �������� ���� L�� �ٿ���
		// longŸ���� �������� �� ���� �ٷ絵�� �Ѵ�.
		// * �ڹٴ� ��� ���� ���ͷ�(������)�� int�� �������� �ٷ���� �Ѵ�.
		long num1 = 10000000000L;
		System.out.println(num1);

		int num2 = 1000000;
		int num3 = 1_000_000;	// ������ ���� �� �ڸ����� ǥ���ϴ� _�� ���� ���� �� �ִ�.
		System.out.println(num2);
		System.out.println(num3);
	}
}