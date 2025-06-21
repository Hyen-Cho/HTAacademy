public class Account {
	int no;			// 계좌번호
	String owner;	// 예금주
	int balance;	// 잔액
	int password;	// 비밀번호

	Account(int newNo, String newOwner, int newPassword) {
		no = newNo;
		owner = newOwner;
		password = newPassword;
		balance = 0;
	}

	Account(int newNo, String newOwner, int newPassword, int newBalance) {
		no = newNo;
		owner = newOwner;
		password = newPassword;
		balance = newBalance;
	}

	void displayInfo() {
		System.out.println("계좌번호 : " + no);
		System.out.println("예 금 주 : " + owner);
		System.out.println("비밀번호 : " + password);
		System.out.println("잔    액 : " + balance);
		System.out.println();
	}

	// 입금기능 : 입금액을 전달받아서 잔액을 증가시키는 기능
	void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("입금이 완료되었습니다.");
		} else {
			System.out.println("입금액이 올바르지 않습니다.");
		}
	}
	
	// 비밀번호 변경기능: 옛날 비밀번호와 새 비밀번호를 전달받아서 비밀번호를 변경하는 기능
	// 옛날 비밀번호와 현재 비밀번호가 일치하다면 비밀번호 변경
	// 일치하지 않으면 화면에 에러메세지 출력
	void changePassword(int oldPassword, int newPassword) {
		if (password == oldPassword) {
			password = newPassword;
			System.out.println("비밀번호가 변경이 완료되었습니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
}