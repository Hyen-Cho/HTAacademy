public class ArrayUtils {

	// 정수로 이루어진 배열을 전달받아서 출력하는 기능
	void printArray(int[] items) {		// numbers 에게 주소를 전달받음
		
		for (int x : items) {
			System.out.print(x + "\t");
		}
		System.out.println();

	}

	// 정수로 이루어진 배열을 전달받아서 가장 큰 값을 제공하는 기능
	int max(int[] items) {
		int result = 0;			// 제공해 줄 값을 담을 그릇을 만든다.
		for (int x : items) {	// 배열을 꺼낼땐 항상 enhanced-for문 사용.
			if (x > result) {	
				result = x;
			}
		}
		return result;
		
	}

	// 정수로 이루어진 배열을 전달받아서 가장 작은 값을 제공하는 기능

	int min(int[] items) {
		int result = 100;
		for (int x : items) {
			if(x < result) {
				result = x;
			}
		}
		return result;
	}

	// 정수로 이루어진 배열을 전달받아서 그 값의 2배로 이루어진 배열을 제공하는 기능

	int[] two(int[] items) {		// 배열을 제공하니까 반환값타입은 배열타입
		int[] arr = new int[items.length];

		for (int i=0; i<items.length; i++) {
			arr[i] = items[i] * 2;
			
		}
		return arr;
	}

}
