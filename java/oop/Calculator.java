public class Calculator {
	
	// 메소드 정의
	// 입력값 있음, 반환값 있음, 동작있음
	int plus(int x, int y) {
		int z = x + y;
		return z;		
		// return 키워드는 메소드를 호출한 곳에 z에  보관된 값을 제공(반환)한다.
	}

	// 메소드 정의
	// 입력값 있음, 반환값 있음, 동작있음
	// 3.14*반지름*반지름

	double area(int r) {
		double result = 3.14 * r * r;
		return result;
	
	}
}
