public class AccountApp {
	public static void main(String[] args) {
		
		// 객체 생성 후 Account(int, String, int) 생성자 메소드를 실행해라
		Account a1 = new Account(10, "홍길동", 1234);
		a1.displayInfo();
		

		// 객체 생성 후 Account(int, String, int, int) 생성자 메소드를 실행해라
		Account a2 = new Account(30, "이순신", 5678, 300000);
		a2.displayInfo();

		// 입금하기
		a1.deposit(10000);
		a1.displayInfo();

		a2.deposit(5000);
		a2.displayInfo();

		// 비밀번호 바꾸기
		a1.changePassword(1234,4321);
		a1.displayInfo();
	}
}
