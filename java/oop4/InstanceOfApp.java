public class InstanceOfApp {
	public static void main(String[] args) {
		
		/*
			��ü instanceof Ŭ����

			Tire t = new SnowTire();

			t instanceof Tire			<--- t�� �ٶ󺸴� ��ü�� Tire�� �ΰ���?				true
			t instanceof SnowTire		<--- t�� �ٶ󺸴� ��ü�� SnowTire�� �ΰ���?			true
			t instanceof KumhoSnowTire	<--- t�� �ٶ󺸴� ��ü�� KumhoSnowTire�� �ΰ���?	false
			kumhoSnowTire�� ��ü�� ���⶧���� false. ������ ��ü�� ����������� �߿�!
		*/

		SnowTire t1 = new SnowTire();
		System.out.println("t1�� Tire���ΰ���? " + (t1 instanceof Tire));
		System.out.println("t1�� SnowTire���ΰ���? " + (t1 instanceof SnowTire));
		System.out.println("t1�� KumhoSnowTire���ΰ���? " + (t1 instanceof KumhoSnowTire));
	}
}
