public interface MemberService {
	// 고객정보를 삭제, 출력 하는 기능
	
	// 추상메소드
	public abstract void removeAllMembers();

	// public abstract는 생략가능하다.
	void printAllMembers();

	void removeMemberByNo(int no);

	String getMemberNameByNo(int no);
}
