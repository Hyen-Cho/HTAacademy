public class ArrayDemo2 {
	public static void main(String[] args) {

		int[] numbers = new int[3];
		double[] scores = new double[5];
		String[] names = new String[3];

		System.out.println(numbers[0]);		// 0번째 값을 출력
		System.out.println(scores[0]);
		System.out.println(names[0]);

		// 배열의 길이를 조회한다.
		System.out.println(numbers.length);		// 3
		System.out.println(scores.length);		// 5
		System.out.println(names.length);		// 3

		// 배열에 값을 저장하기
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 150;

		names[0] = "홍길동";
		names[1] = "이순신";
		names[2] = "강감찬";
		names[3] = "김유신";		// 배열의 인덱스 범위를 초과. 실행할때 에러남.
	}
}
