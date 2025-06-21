public class TireApp3 {
	public static void main(String[] args) {
		
		// 오류 : KumhoSnowTire객체를 HankookSnowTire 타입으로 형변환할 수 없다..
		
		HankookSnowTire t1 = new KumhoSnowTire();

		// 오류 : Tire객체를 SnowTire타입으로 형변환할 수 없다.
		// 부모타입객체를 자식타입의 참조변수에 담을 수 없다.
		SnowTire t1 = new Tire();
	}
}
