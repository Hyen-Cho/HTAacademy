public class MemberApp {
	public static void main(String[] args) {
		
		// MemberService 인터페이스를 구현한 객체 생성
		MemberServiceImpl service1 = new MemberServiceImpl();
		service1.printAllMembers();

		// 인터페이스를 구현한 객체는 인터페이스타입의 변수에 담을 수 있다.
		MemberService service2 = new MemberServiceImpl();
	} 
}
