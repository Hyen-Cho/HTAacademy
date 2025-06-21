public class TireTester {
	
	public void testTire(SnowTire tire) {

		if (tire instanceof HankookSnowTire) {		// tire 객체에 HankookSnowTire류가 있나요?
			HankookSnowTire t = (HankookSnowTire) tire;		// 강제형변환
			t.melt();

		} else if (tire instanceof KumhoSnowTire) {	// tire 객체에 KumhoSnowTire류가 있나요?
			((KumhoSnowTire) tire).push();					// 강제형변환
		}
	
	}
}
