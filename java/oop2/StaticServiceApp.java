public class StaticServiceApp {
	public static void main(String[] args) {
		
		// �����ʵ�, �����޼ҵ�� ��ü �������� ��� ��밡���ϴ�.
		// Ŭ�����̸�.�ʵ��
		// Ŭ�����̸�.�޼ҵ��()	���·� ����Ѵ�.
		StaticService.y = 10;		// �����ʵ� ����ϱ�
		StaticService.m2();			// �����޼ҵ� ����ϱ�

		// final ���� z���� ���ο� ���� �Ҵ��� �� ����.
		StaticService.z = 20;		// ������ ����
		System.out.println(StaticService.z);
	}
}
