public class MemberApp {
	public static void main(String[] args) {
		
		// MemberService �������̽��� ������ ��ü ����
		MemberServiceImpl service1 = new MemberServiceImpl();
		service1.printAllMembers();

		// �������̽��� ������ ��ü�� �������̽�Ÿ���� ������ ���� �� �ִ�.
		MemberService service2 = new MemberServiceImpl();
	} 
}
