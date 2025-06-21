public class ArrayUtils {

	// ������ �̷���� �迭�� ���޹޾Ƽ� ����ϴ� ���
	void printArray(int[] items) {		// numbers ���� �ּҸ� ���޹���
		
		for (int x : items) {
			System.out.print(x + "\t");
		}
		System.out.println();

	}

	// ������ �̷���� �迭�� ���޹޾Ƽ� ���� ū ���� �����ϴ� ���
	int max(int[] items) {
		int result = 0;			// ������ �� ���� ���� �׸��� �����.
		for (int x : items) {	// �迭�� ������ �׻� enhanced-for�� ���.
			if (x > result) {	
				result = x;
			}
		}
		return result;
		
	}

	// ������ �̷���� �迭�� ���޹޾Ƽ� ���� ���� ���� �����ϴ� ���

	int min(int[] items) {
		int result = 100;
		for (int x : items) {
			if(x < result) {
				result = x;
			}
		}
		return result;
	}

	// ������ �̷���� �迭�� ���޹޾Ƽ� �� ���� 2��� �̷���� �迭�� �����ϴ� ���

	int[] two(int[] items) {		// �迭�� �����ϴϱ� ��ȯ��Ÿ���� �迭Ÿ��
		int[] arr = new int[items.length];

		for (int i=0; i<items.length; i++) {
			arr[i] = items[i] * 2;
			
		}
		return arr;
	}

}
