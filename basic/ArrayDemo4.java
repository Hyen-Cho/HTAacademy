public class ArrayDemo4 {
	public static void main(String[] args) {
		
		int[] scores = {70, 20, 50, 44, 28, 70, 80, 100};

		// scores 배열의 값 반복 출력
		System.out.println("국어점수 리스트");
		for (int x : scores) {			/* enhanced-for문
										   ( 배열의 원소를 담는 그릇 : 반복처리할 배열)
											*/
			System.out.println(x);		
		}
		
		// 총점, 평균 표현
		int total = 0;
		int average = 0;
		int min = 100;	// 예상되는 가장 큰 값을 담고 시작한다.
		int max = 0;	// 예상되는 가장 작은 값을 담고 시작한다.

		for (int x : scores) {
			total = total + x;
		}
		average = total/scores.length;		// 총점 / scores 배열 값의 갯수(length)

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);

		// 최소값 구하기
		// 배열의 값을 하나씩 꺼내서 min에 저장된 값과 비교해서
		// min값보다 꺼낸 값이 작다면 min의 값을 지금 꺼낸 값으로 교체한다.
		for (int x : scores) {
			if ( x < min) {
				min = x;
			}
		}
		System.out.println("최소값 : " + min);		// 최소값 : 20

		// 최대값 구하기
		// 배열의 값을 하나씩 꺼내서 max에 저장된 값과 비교해서
		// max 값보다 꺼낸 값이 크다면 max의 값을 지금 꺼낸 값으로 교체한다.
		for (int x : scores) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("최대값 : " + max);		// 최대값: 100
	}
}
