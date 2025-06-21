public class TireTesterApp {
	public static void main(String[] args) {
		
		TireTester tester = new TireTester();

		Tire t1 = new Tire();
		// tester.testTire(t1);	// 에러
		// testTire(SnowTire tire)메소드는 SnowTire류 객체만 전달받을 수 있다.

		KumhoSnowTire t2 = new KumhoSnowTire();
		tester.testTire(t2);

		HankookSnowTire t3 = new HankookSnowTire();
		tester.testTire(t3);
		
	}
}
