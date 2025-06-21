public class TireApp2 {
	public static void main(String[] args) {
		
		// ´ÙÇü¼º
		Tire t1 = new KumhoSnowTire();
		Tire t2 = new HankookSnowTire();
		Tire t3 = new SnowTire();
		Tire t4 = new Tire();

		t1.go();
		t2.go();
		t3.go();
		t4.go();
	}
}
