public class CarApp {
	public static void main(String[] args) {
		
		Tico obj1 = new Tico();
		obj1.start();
		obj1.stop();
		obj1.navi();
		obj1.aircon();

		// Tico��ü�� Car�������̽� Ÿ���� ���������� ������ �� �ִ�.
		Car obj2 = new Tico();
		obj2.start();
		obj2.stop();
		obj2.navi();
		obj2.aircon();

		Genesis obj3 = new Genesis();
		obj3.start();
		obj3.stop();
		obj3.navi();
		obj3.aircon();
		obj3.autoDrive();
		obj3.highpass();
		obj3.airbag();
		obj3.record();
		obj3.headupDisplay();

		Car obj4 = new Genesis();
		obj4.start();
		obj4.stop();
		obj4.navi();
		obj4.aircon();

		AutoDrivable car5 = new Genesis();
		car5.autoDrive();
		// car5.start();	// ���� ----> ((Car)car5).start();	����

	}
}
