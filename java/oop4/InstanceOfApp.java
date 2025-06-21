public class InstanceOfApp {
	public static void main(String[] args) {
		
		/*
			객체 instanceof 클래스

			Tire t = new SnowTire();

			t instanceof Tire			<--- t가 바라보는 객체가 Tire류 인가요?				true
			t instanceof SnowTire		<--- t가 바라보는 객체가 SnowTire류 인가요?			true
			t instanceof KumhoSnowTire	<--- t가 바라보는 객체가 KumhoSnowTire류 인가요?	false
			kumhoSnowTire는 객체가 없기때문에 false. 무엇을 객체로 만들었는지가 중요!
		*/

		SnowTire t1 = new SnowTire();
		System.out.println("t1은 Tire류인가요? " + (t1 instanceof Tire));
		System.out.println("t1은 SnowTire류인가요? " + (t1 instanceof SnowTire));
		System.out.println("t1은 KumhoSnowTire류인가요? " + (t1 instanceof KumhoSnowTire));
	}
}
