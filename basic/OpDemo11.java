public class OpDemo11 {
	public static void main(String[] args) {
		// 삼항연산자 -> 조건식 ? 값1		: 값2
		//				 조건식 ? 연산식1	: 연산식2
		// 값1과 값2의 타입은 동일해야 한다.
		// 연산식1과, 연산식2의 계산결과도 타입이 동일해야 한다.
		// 조건식의 계산결과가 true이면 값1, false면 값2가 삼항연산자의 연산결과가 된다.

		int score = 65;
		String result = (score >= 60 ? "합격" : "불합격");

		System.out.println("최종결과 " + result);		// 최종결과 합격


		int totalPrice = 100000;
		int grade = 1;

		double point = (grade == 1 ? totalPrice*0.03 : totalPrice*0.01);

		System.out.println("포인트 " + point);			// 포인트 3000.0

	}
}
