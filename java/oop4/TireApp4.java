public class TireApp4 {
	public static void main(String[] args) {
		
		Tire t1 = new KumhoSnowTire();
		t1.go();
		// t1.chain();		--> ����
		// t1.push();		--> ����

		SnowTire t2 = (SnowTire) t1;
		t2.go();
		t2.chain();
		// t2.push();		--> ����
		
		// �Ǵٸ����(�������ι��)
		((KumhoSnowTire)t1).push();

	}
}
