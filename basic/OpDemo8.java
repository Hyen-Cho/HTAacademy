public class OpDemo8 {
	public static void main(String[] args) {
		// �� ������: && || !
		// �� �������� ���� ����� true Ȥ�� false ���� ����� ������ ���̴�.
		// �� �������� ���� ����� true Ȥ�� false ���̴�.

		int year = 2017;
		int distance = 60000;

		// ���űⰣ�� 3���� ����� ��� Ȥ�� ����Ÿ��� 5�� km �̻��� ��� ����ó��
		boolean result = (2019 - year) > 3 || distance >= 50000;
		System.out.println("������� ���� -> " + result);		// true
	}
}
