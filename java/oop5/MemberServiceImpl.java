public class MemberServiceImpl implements MemberService {
		// implements: ��������. �������̽��� Ŭ���� ����

	public void removeAllMembers() {
		System.out.println("�������Ͽ��� ��� ȸ�������� �����Ѵ�.");
	}

	public void printAllMembers() {
		System.out.println("���������� ��� ȸ�������� ����Ѵ�.");
	}

	public void removeMemberByNo(int no) {
		System.out.println("�������Ͽ��� " + no + "�� ȸ���� �����Ѵ�.");
	}

	public String getMemberNameByNo(int no) {
		String name = null;

		name = "ȫ�浿";
		System.out.println("�������Ͽ��� " + no + "�� ȸ���� �̸��� ��ȸ�Ѵ�.");
		return name;
	}
}
