public class MemberServiceImpl implements MemberService {
		// implements: 구현관계. 인터페이스와 클래스 관계

	public void removeAllMembers() {
		System.out.println("엑셀파일에서 모든 회원정보를 삭제한다.");
	}

	public void printAllMembers() {
		System.out.println("엑셀파일의 모든 회원정보를 출력한다.");
	}

	public void removeMemberByNo(int no) {
		System.out.println("엑셀파일에서 " + no + "번 회원을 삭제한다.");
	}

	public String getMemberNameByNo(int no) {
		String name = null;

		name = "홍길동";
		System.out.println("엑셀파일에서 " + no + "번 회원의 이름을 조회한다.");
		return name;
	}
}
