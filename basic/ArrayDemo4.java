public class ArrayDemo4 {
	public static void main(String[] args) {
		
		int[] scores = {70, 20, 50, 44, 28, 70, 80, 100};

		// scores �迭�� �� �ݺ� ���
		System.out.println("�������� ����Ʈ");
		for (int x : scores) {			/* enhanced-for��
										   ( �迭�� ���Ҹ� ��� �׸� : �ݺ�ó���� �迭)
											*/
			System.out.println(x);		
		}
		
		// ����, ��� ǥ��
		int total = 0;
		int average = 0;
		int min = 100;	// ����Ǵ� ���� ū ���� ��� �����Ѵ�.
		int max = 0;	// ����Ǵ� ���� ���� ���� ��� �����Ѵ�.

		for (int x : scores) {
			total = total + x;
		}
		average = total/scores.length;		// ���� / scores �迭 ���� ����(length)

		System.out.println("���� : " + total);
		System.out.println("��� : " + average);

		// �ּҰ� ���ϱ�
		// �迭�� ���� �ϳ��� ������ min�� ����� ���� ���ؼ�
		// min������ ���� ���� �۴ٸ� min�� ���� ���� ���� ������ ��ü�Ѵ�.
		for (int x : scores) {
			if ( x < min) {
				min = x;
			}
		}
		System.out.println("�ּҰ� : " + min);		// �ּҰ� : 20

		// �ִ밪 ���ϱ�
		// �迭�� ���� �ϳ��� ������ max�� ����� ���� ���ؼ�
		// max ������ ���� ���� ũ�ٸ� max�� ���� ���� ���� ������ ��ü�Ѵ�.
		for (int x : scores) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("�ִ밪 : " + max);		// �ִ밪: 100
	}
}
