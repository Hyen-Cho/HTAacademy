public class TireApp {
	public static void main(String[] args) {
		
		KumhoSnowTire t1 = new KumhoSnowTire();
		SnowTire t2 = new KumhoSnowTire();
		Tire t3 = new KumhoSnowTire();

		t1.go();
		t2.go();
		t3.go();		
		// 가장 마지막에 재정의한것이 결과로 나타난다.
	}
}
