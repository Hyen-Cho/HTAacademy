public class ArrayDemo1 {
	public static void main(String[] args) {
		
		int[] numbers = {10, 14, 20, 3, 15};

		// System.out.println(numbers[0]);
		// System.out.println(numbers[1]);
		// System.out.println(numbers[2]);
		// System.out.println(numbers[3]);
		// System.out.println(numbers[4]);

		// 또다른 표현
		// for (int x=0; x<=4; x++) {
		// 	System.out.println(numbers[x]);
		// }

		// inhanced for문: 배열과 콜렉션을 자동으로 반복처리 해줌
		// (배열의 원소를 담는 그릇 : 반복처리할 배열)
		for (int a : numbers) {
			System.out.println(a);
		}
	}
}
