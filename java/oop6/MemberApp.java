import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService service = new MemberService();

		for (;;) {
			if (service.getSession() == null) {
			// 로그인되지 않은 회원에게 보여지는 메뉴
			System.out.println("1.회원가입 | 2.로그인 | 0.종료");
			} else {
			// 로그인된 회원에게 보여지는 메뉴
			System.out.println("3.전체출력 | 4.한명출력 | 5.로그아웃 | 6.상품정보출력 | 7.주문하기 | 8.주문내역 | 0.종료");
			}
			
			System.out.print("메뉴 선택> ");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.println("### 회원가입 하기 ###");

				System.out.print("회원번호 입력> ");
				int no = scanner.nextInt();

				System.out.print("이    름 입력> ");
				String name = scanner.next();

				System.out.print("비밀번호 입력> ");
				int password = scanner.nextInt();
				
				System.out.print("포 인 트 입력> ");
				int point = scanner.nextInt();

				Member m = new Member();
				m.setNo(no);
				m.setName(name);
				m.setPassword(password);
				m.setPoint(point);

				service.register(m);

			} else if (selectNo == 2) {
				System.out.println("### 로그인 하기 ###");

				System.out.print("회원번호 입력> ");
				int no = scanner.nextInt();
				System.out.print("비밀번호 입력> ");
				int password = scanner.nextInt();

				service.login(no,password);
			
			} else if (selectNo == 3) {

				service.printAllMembers();
			
			} else if (selectNo == 4) {

				System.out.print("조회할 회원의 번호입력> ");
				int no = scanner.nextInt();

				service.printMemberByNo(no);
			
			} else if (selectNo == 5) {

				service.logout();
			
			} else if (selectNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}