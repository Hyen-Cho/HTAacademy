public class OpDemo4 {
	public static void main(String[] args) {
		// 대입 연산자 : = += -= *= /= %=

		int a = 10;

		a = a + 1;		// a의 값과 1을 더한 후 그 값을 다시 a에 저장한다.
		System.out.println(a);		// 11

		a = a + 1;
		System.out.println(a);		// 12

		a += 1;			// a의 값을 1 증가시킨다. 축약형
		System.out.println(a);		// 13

		a -= 1;			// a의 값을 1 감소시킨다.
		System.out.println(a);		// 12

		a += 2;			// a의 값을 2 증가시킨다.
		System.out.println(a);		// 14

		a *= 2;			// a의 값을 2 곱한다.
		System.out.println(a);

	}
}
