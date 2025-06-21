public class PhoneApp {
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.tel = "010-2345-5678";
		p1.connect();
		p1.disconnect();

		SmartPhone p2 = new SmartPhone();
		p2.tel = "010-1111-2222";
		p2.connect();
		p2.disconnect();
		p2.ipAddress = "192.168.10.254";
		p2.internet();
		p2.facetime();
	}
}
