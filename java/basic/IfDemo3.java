public class IfDemo3 {
	public static void main(String[] args) {
		
		int score = 91;

		// 60�� �̻� �հ�(�հ����߿��� 95�� �̻� ���б� ����, �׿� ���б� 10����)
		if (score >= 60) {
			System.out.println("�հ��Դϴ�.");
			if (score >= 95) {
				System.out.println("���б� ��������Դϴ�.");
			} else {
				System.out.println("���б� 10������ �����ϼ���.");
			}
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
}
