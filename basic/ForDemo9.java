public class ForDemo9 {
	public static void main(String[] args) {
		
		// Math.random();	0���� ũ�� 1���� ���� ������ �Ǽ��� ����� ���� ��
		// �ζ� ��ȣ

		for (int i=1; i<=6; i++) {
			double number = (int) (Math.random()*45 + 1);	// ������ȯ
			System.out.println(number);

		}
	}
}
