public class ArrayDemo2 {
	public static void main(String[] args) {

		int[] numbers = new int[3];
		double[] scores = new double[5];
		String[] names = new String[3];

		System.out.println(numbers[0]);		// 0��° ���� ���
		System.out.println(scores[0]);
		System.out.println(names[0]);

		// �迭�� ���̸� ��ȸ�Ѵ�.
		System.out.println(numbers.length);		// 3
		System.out.println(scores.length);		// 5
		System.out.println(names.length);		// 3

		// �迭�� ���� �����ϱ�
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 150;

		names[0] = "ȫ�浿";
		names[1] = "�̼���";
		names[2] = "������";
		names[3] = "������";		// �迭�� �ε��� ������ �ʰ�. �����Ҷ� ������.
	}
}
