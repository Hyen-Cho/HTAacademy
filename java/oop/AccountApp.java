import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int accountNumbers = 0;			// 계좌수
		Account[] accounts = null;		// Account 객체를 담는 배열을 담을 그릇
		int haveNum = 0;

		for (;;) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.계좌수입력, 2.계좌정보입력, 3.계좌정보출력, 4.입금, 5.출금, 0.종료");
			System.out.println("--------------------------------------------------------");

			System.out.print("메뉴 선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("갖고 있는 통장 갯수> ");
				haveNum = scanner.nextInt();
				accounts = new Account[haveNum];

			} else if (selectNo == 2) { 

				for (int i=0; i<haveNum; i++) {

					System.out.print("통장이름> ");
					String iTitle = scanner.next();

					System.out.print("계좌번호> ");
					int iNum = scanner.nextInt();

					System.out.print("비밀번호> ");
					int iPw = scanner.nextInt();

					System.out.print("이름> ");
					String iName = scanner.next();

					System.out.print("잔액> ");
					int iBalance = scanner.nextInt();

					Account ac = new Account();
					ac.title = iTitle;
					ac.number = iNum;
					ac.password = iPw;
					ac.name = iName;
					ac.balance = iBalance;

					accounts[i] = ac; 

				}

			} else if (selectNo == 3) {
				
				for (Account x : accounts) {
				System.out.println("통장이름 : " + x.title);
				System.out.println("계좌번호 : " + x.number);
				System.out.println("이름 : " + x.name);
				System.out.println("잔액 : " + x.balance);
				}

			} else if (selectNo == 4) {
			// 입력된 계좌번호와 일치하는 계좌정보를 찾고
			// 입력된 비밀번호와 찾아진 계좌의 비밀번호가 일치하는 경우에만
			// 입금/출금이 된다.

				System.out.println("[계좌 입금]");

				System.out.print("계좌번호 입력> ");
				int no = scanner.nextInt();
				System.out.print("비밀번호 입력> ");
				int password = scanner.nextInt();
				System.out.print("입 금 액 입력> ");
				int amount = scanner.nextInt();				

				boolean isSuccess = false;
				for (Account x : accounts) {
					if (x.number == no && x.password == password) {
						x.balance += amount;
						isSuccess =  true;
						break;
					}				
				}

				if (isSuccess) {
					System.out.println("입금처리가 완료되었습니다.");
				} else {
					System.out.println("계좌번호 혹은 비밀번호가 올바르지 않습니다.");
				}


			} else if (selectNo == 5) {

				System.out.println("[계좌 입금]");

				System.out.print("계좌번호 입력> ");
				int no = scanner.nextInt();
				System.out.print("비밀번호 입력> ");
				int password = scanner.nextInt();
				System.out.print("입 금 액 입력> ");
				int amount = scanner.nextInt();		

				boolean isSuccess = false;
				for (Account x : accounts) {
					if (x.number == no && x.password == password) {
						x.balance -= amount;
						isSuccess = true;
						break;
					}
				}

				if (isSuccess) {
					System.out.println("출금처리가 완료되었습니다.");
				} else {
					System.out.println("계좌번호 혹은 비밀번호가 올바르지 않습니다.");
				}

			} else if (selectNo == 0) {

				System.out.println("프로그램종료");
				break;
			}
			
		}
	}
}
