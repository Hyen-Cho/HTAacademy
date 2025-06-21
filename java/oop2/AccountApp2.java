import java.util.Scanner;

public class AccountApp2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Account[] accounts = new Account[2];

		for (;;) {
			System.out.println("1.입력 | 2.조회 | 3.입금 | 4.비번변경 | 0.종료");
			System.out.println();

			System.out.print("메뉴 선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 번호, 소유주, 비번, 잔액을 입력받아서
				// Account객체를 생성하고(매개변수 4개짜리 생성자 활용)
				// account 배열에 담기
				
				for (int i=0; i<2; i++) {
					System.out.print("계좌번호입력> ");
					int num = scanner.nextInt();

					System.out.print("소유주입력> ");
					String name = scanner.next();

					System.out.print("비번입력> ");
					int passWord = scanner.nextInt();

					System.out.print("잔액입력> ");
					int balance = scanner.nextInt();

					Account a = new Account(num, name, passWord, balance);
					accounts[i] = a;
				}

			} else if (selectNo == 2) {

				for (Account acc : accounts) {
					acc.displayInfo();
				}			
			
			} else if (selectNo == 3) {
				System.out.print("번호 입력> ");
				int num = scanner.nextInt();
				System.out.print("입금할 금액 입력> ");
				int price = scanner.nextInt();


			
			} else if (selectNo == 4) {
			
			} else if (selectNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println();
		}
	}
}