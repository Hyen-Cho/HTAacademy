public class TypeDemo1 {
	public static void main(String[] args) {
		// 정수타입: byte, short, int, long
		
		// byte b = 1000;	해당 타입이 가질 수 있는 값의 범위를 초과하는 값은 저장할 수 없다.

		// ling타입의 변수에 값을 담을 때는 정수값의 끝에 L을 붙여서
		// long타입의 범위에서 그 값을 다루도록 한다.
		// * 자바는 모든 정수 리터럴(정수값)을 int의 범위에서 다루려고 한다.
		long num1 = 10000000000L;
		System.out.println(num1);

		int num2 = 1000000;
		int num3 = 1_000_000;	// 정수를 적을 때 자릿수를 표현하는 _를 같이 적을 수 있다.
		System.out.println(num2);
		System.out.println(num3);
	}
}