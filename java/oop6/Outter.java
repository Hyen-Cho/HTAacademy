public class Outter {

	// 인스턴스 멤버 내부클래스
	// Outter객체가 생성된 다음에만 사용할 수 있는 내부 클래스
	// outter객체의 모든 멤버(필드, 메소드)를 사용할 수 있다.
	public class Inner1 {
	
	}

	// 정적 멤버 내부클래스
	// Outter객체 생성없이 사용할 수 있는 내부 클래스
	// Outter의 정적 멤버(정적필드, 정적 메소드)만 사용할 수 있다.
	public static class Inner2 {
	
	}
	
	// 로컬 내부클래스
	// 메소드가 실행되는 동안에만 사용할 수 있는 내부 클래스
	// Outter객체의 모든 멤버를 사용할 수 있다.
	public void method() {
		int x = 10;
		x = 20;
		class Inner3 {
			public void m1() {
				System.out.println(x);
			}
		}
	}
}