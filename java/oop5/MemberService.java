public interface MemberService {
	// �������� ����, ��� �ϴ� ���
	
	// �߻�޼ҵ�
	public abstract void removeAllMembers();

	// public abstract�� ���������ϴ�.
	void printAllMembers();

	void removeMemberByNo(int no);

	String getMemberNameByNo(int no);
}
