public class OpDemo4 {
	public static void main(String[] args) {
		// ���� ������ : = += -= *= /= %=

		int a = 10;

		a = a + 1;		// a�� ���� 1�� ���� �� �� ���� �ٽ� a�� �����Ѵ�.
		System.out.println(a);		// 11

		a = a + 1;
		System.out.println(a);		// 12

		a += 1;			// a�� ���� 1 ������Ų��. �����
		System.out.println(a);		// 13

		a -= 1;			// a�� ���� 1 ���ҽ�Ų��.
		System.out.println(a);		// 12

		a += 2;			// a�� ���� 2 ������Ų��.
		System.out.println(a);		// 14

		a *= 2;			// a�� ���� 2 ���Ѵ�.
		System.out.println(a);

	}
}
