public class TireTester {
	
	public void testTire(SnowTire tire) {

		if (tire instanceof HankookSnowTire) {		// tire ��ü�� HankookSnowTire���� �ֳ���?
			HankookSnowTire t = (HankookSnowTire) tire;		// ��������ȯ
			t.melt();

		} else if (tire instanceof KumhoSnowTire) {	// tire ��ü�� KumhoSnowTire���� �ֳ���?
			((KumhoSnowTire) tire).push();					// ��������ȯ
		}
	
	}
}
