public class StaticService {
	
	int x;				// ���赵 �ε� �� -> ��ü ���� �� ��밡���� �ʵ�
	static int y;		// ���赵 �ε� �� ��밡���� �ʵ�
	static final int z = 10;

	// �ν��Ͻ� �޼ҵ�
	public void m1() {
		System.out.println("x�� ��: " + x);
		System.out.println("y�� ��: " + StaticService.y);
	}
	
	// ������ �޼ҵ�
	public static void m2() {
		// static �޼ҵ�� static �ʵ�, static �޼ҵ常 ���(����)�����ϴ�.
		// System.out.println("x�� ��: " + x);			// ������ ����
		System.out.println("y�� ��: " + StaticService.y);
	}
}
