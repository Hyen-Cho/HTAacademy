public class TireApp4 {
	public static void main(String[] args) {
		
		Tire t1 = new KumhoSnowTire();
		t1.go();
		// t1.chain();		--> 에러
		// t1.push();		--> 에러

		SnowTire t2 = (SnowTire) t1;
		t2.go();
		t2.chain();
		// t2.push();		--> 에러
		
		// 또다른방법(직접적인방법)
		((KumhoSnowTire)t1).push();

	}
}
