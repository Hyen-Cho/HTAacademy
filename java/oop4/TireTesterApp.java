public class TireTesterApp {
	public static void main(String[] args) {
		
		TireTester tester = new TireTester();

		Tire t1 = new Tire();
		// tester.testTire(t1);	// ����
		// testTire(SnowTire tire)�޼ҵ�� SnowTire�� ��ü�� ���޹��� �� �ִ�.

		KumhoSnowTire t2 = new KumhoSnowTire();
		tester.testTire(t2);

		HankookSnowTire t3 = new HankookSnowTire();
		tester.testTire(t3);
		
	}
}
