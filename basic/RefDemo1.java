public class RefDemo1 {
	public static void main(String[] args) {
		
		int[] a = {10, 30, 40, 100};
		int[] b = a;

		System.out.println("a -> " + a[0]);
		System.out.println("b -> " + b[0]);

		System.out.println();

		b[0] = 300;

		System.out.println("a -> " + a[0]);
		System.out.println("b -> " + b[0]);

		System.out.println();

		b = null;

		System.out.println("a -> " + a[0]);
		System.out.println("b -> " + b[0]);

		// NullPointerException 널 포인트 예외상황

	}
}
