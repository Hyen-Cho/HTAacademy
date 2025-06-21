import java.util.Scanner;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService service = new MemberService();

		for (;;) {
			if (service.getSession() == null) {
			// �α��ε��� ���� ȸ������ �������� �޴�
			System.out.println("1.ȸ������ | 2.�α��� | 0.����");
			} else {
			// �α��ε� ȸ������ �������� �޴�
			System.out.println("3.��ü��� | 4.�Ѹ���� | 5.�α׾ƿ� | 6.��ǰ������� | 7.�ֹ��ϱ� | 8.�ֹ����� | 0.����");
			}
			
			System.out.print("�޴� ����> ");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.println("### ȸ������ �ϱ� ###");

				System.out.print("ȸ����ȣ �Է�> ");
				int no = scanner.nextInt();

				System.out.print("��    �� �Է�> ");
				String name = scanner.next();

				System.out.print("��й�ȣ �Է�> ");
				int password = scanner.nextInt();
				
				System.out.print("�� �� Ʈ �Է�> ");
				int point = scanner.nextInt();

				Member m = new Member();
				m.setNo(no);
				m.setName(name);
				m.setPassword(password);
				m.setPoint(point);

				service.register(m);

			} else if (selectNo == 2) {
				System.out.println("### �α��� �ϱ� ###");

				System.out.print("ȸ����ȣ �Է�> ");
				int no = scanner.nextInt();
				System.out.print("��й�ȣ �Է�> ");
				int password = scanner.nextInt();

				service.login(no,password);
			
			} else if (selectNo == 3) {

				service.printAllMembers();
			
			} else if (selectNo == 4) {

				System.out.print("��ȸ�� ȸ���� ��ȣ�Է�> ");
				int no = scanner.nextInt();

				service.printMemberByNo(no);
			
			} else if (selectNo == 5) {

				service.logout();
			
			} else if (selectNo == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}
	}
}