public abstract class DatabaseAccess {
	
	public void connect() {
		System.out.println("데이터베이스와 연결");
	}

	public void command() {
		System.out.println("데이터베이스에 쿼리문 전송");
	}

	public void receive() {
		System.out.println("데이터베이스로부터 데이터 획득");
	}

	public void disconnect() {
		System.out.println("데이터베이스와 연결해제");
	}

	public abstract void display();		// 추상화 메소드 정의

	public void access()  {
		connect();
		command();
		receive();
		display();		// 추상화 메소드
		disconnect();
	}
}
