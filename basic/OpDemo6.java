public class OpDemo6 {
	public static void main(String[] args) {
		int a = 10;
		int x = ++a;		// a�� 1 ������, 11�� x�� ���Ե�.
		System.out.println("a -> " + a);		// 11
		System.out.println("x -> " + x);		// 11

		int b = 10;
		int y = b++;		// b�� ���� ���Ե�, b�� 1 ������.
		System.out.println("b -> " + b);		// 11
		System.out.println("y -> " + y);		// 10

		// �����Ǵ� ������ ���̰� ����
		// �ٸ� ����� ����ϸ� ������
	}
}

// ���� ������ õ��