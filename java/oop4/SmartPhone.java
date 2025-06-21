public class SmartPhone extends Phone {
		
	String ipAddress;

	public void facetime() {
		System.out.println(tel + "로 화상통화를 시작합니다.");
	}

	public void internet() {
		System.out.println(ipAddress + "로 인터넷에 접속합니다.");
	}
}
