public class OpDemo8 {
	public static void main(String[] args) {
		// 논리 연산자: && || !
		// 논리 연산자의 연산 대상은 true 혹은 false 값을 결과로 내놓은 식이다.
		// 논리 연산자의 연산 결과는 true 혹은 false 값이다.

		int year = 2017;
		int distance = 60000;

		// 구매기간이 3년이 경과된 경우 혹은 주행거리가 5만 km 이상인 경우 유상처리
		boolean result = (2019 - year) > 3 || distance >= 50000;
		System.out.println("유상수리 여부 -> " + result);		// true
	}
}
