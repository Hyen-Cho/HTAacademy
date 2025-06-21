public class CastingDemo1 {
	public static void main(String[] args) {
		double num1 = 10;
		System.out.println(num1);

		int num2 = 3;
		int num3 = 10;
		System.out.println(num2/num3);	// 정수/정수 ----> 정수

		double num4 = 3.0;
		double num5 = 10.0;
		System.out.println(num4/num5);	// 실수/실수 ----> 실수
										// 연산에 참여한 타입과 같은 타입의 결과가 나옴

		System.out.println(num2/num5);	// 정수/실수 -> 실수/실수 ----> 실수
										// 다른 타입의 연산은 타입을 같게 만든 후 연산이 일어남
										// 더 큰 타입으로 변환 후 연산
										// 자바는 이런면에서 정확함!
	}
}
// 자동형변환
// 1. 작은 타입의 값을 큰 타입의 그릇에 담을 때
// 2. 덜 정밀한 타입의 값을 정밀한 타입의 그릇에 담을 때
// 3. 연산에 참여한 값의 타입과 연산의 결과가 같은 타입이 되게 할 때
// 4. 연산에 참여한 값의 타입이 서로 다른 경우 더 큰 타입의 값으로 변경될 때
