public class OpDemo7 {
	public static void main(String[] args) {
		// 비교 연산자: == != > < >= <=
		// 비교 연산자의 연산 결과는 항상 true 혹은 false 값이다.

		int a = 5;
		int b = 4;

		boolean result1 = a == b;
		System.out.println(result1);		// false

		boolean result2 = a != b;
		System.out.println(result2);		// true

		System.out.println(a > b);			// true
		System.out.println(a >= b);			// true
		System.out.println(a < b);			// false
		System.out.println(a <= b);			// false
	}
}
