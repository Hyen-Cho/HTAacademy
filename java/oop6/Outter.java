public class Outter {

	// �ν��Ͻ� ��� ����Ŭ����
	// Outter��ü�� ������ �������� ����� �� �ִ� ���� Ŭ����
	// outter��ü�� ��� ���(�ʵ�, �޼ҵ�)�� ����� �� �ִ�.
	public class Inner1 {
	
	}

	// ���� ��� ����Ŭ����
	// Outter��ü �������� ����� �� �ִ� ���� Ŭ����
	// Outter�� ���� ���(�����ʵ�, ���� �޼ҵ�)�� ����� �� �ִ�.
	public static class Inner2 {
	
	}
	
	// ���� ����Ŭ����
	// �޼ҵ尡 ����Ǵ� ���ȿ��� ����� �� �ִ� ���� Ŭ����
	// Outter��ü�� ��� ����� ����� �� �ִ�.
	public void method() {
		int x = 10;
		x = 20;
		class Inner3 {
			public void m1() {
				System.out.println(x);
			}
		}
	}
}