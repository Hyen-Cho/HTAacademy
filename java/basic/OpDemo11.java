public class OpDemo11 {
	public static void main(String[] args) {
		// ���׿����� -> ���ǽ� ? ��1		: ��2
		//				 ���ǽ� ? �����1	: �����2
		// ��1�� ��2�� Ÿ���� �����ؾ� �Ѵ�.
		// �����1��, �����2�� ������� Ÿ���� �����ؾ� �Ѵ�.
		// ���ǽ��� ������� true�̸� ��1, false�� ��2�� ���׿������� �������� �ȴ�.

		int score = 65;
		String result = (score >= 60 ? "�հ�" : "���հ�");

		System.out.println("������� " + result);		// ������� �հ�


		int totalPrice = 100000;
		int grade = 1;

		double point = (grade == 1 ? totalPrice*0.03 : totalPrice*0.01);

		System.out.println("����Ʈ " + point);			// ����Ʈ 3000.0

	}
}
