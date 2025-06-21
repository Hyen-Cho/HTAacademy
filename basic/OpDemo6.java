public class OpDemo6 {
	public static void main(String[] args) {
		int a = 10;
		int x = ++a;		// a가 1 증가됨, 11이 x에 대입됨.
		System.out.println("a -> " + a);		// 11
		System.out.println("x -> " + x);		// 11

		int b = 10;
		int y = b++;		// b의 값이 대입됨, b가 1 증가됨.
		System.out.println("b -> " + b);		// 11
		System.out.println("y -> " + y);		// 10

		// 증가되는 시점에 차이가 있음
		// 다른 연산과 사용하면 위험함
	}
}

// 고슬링 아저씨 천재