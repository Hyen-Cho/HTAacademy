public class ArrayDemo1 {
	public static void main(String[] args) {
		
		int[] numbers = {10, 14, 20, 3, 15};

		// System.out.println(numbers[0]);
		// System.out.println(numbers[1]);
		// System.out.println(numbers[2]);
		// System.out.println(numbers[3]);
		// System.out.println(numbers[4]);

		// �Ǵٸ� ǥ��
		// for (int x=0; x<=4; x++) {
		// 	System.out.println(numbers[x]);
		// }

		// inhanced for��: �迭�� �ݷ����� �ڵ����� �ݺ�ó�� ����
		// (�迭�� ���Ҹ� ��� �׸� : �ݺ�ó���� �迭)
		for (int a : numbers) {
			System.out.println(a);
		}
	}
}
