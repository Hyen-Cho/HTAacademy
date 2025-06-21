public class StaticService {
	
	int x;				// 설계도 로딩 후 -> 객체 생성 후 사용가능한 필드
	static int y;		// 설계도 로딩 후 사용가능한 필드
	static final int z = 10;

	// 인스턴스 메소드
	public void m1() {
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + StaticService.y);
	}
	
	// 정적인 메소드
	public static void m2() {
		// static 메소드는 static 필드, static 메소드만 사용(접근)가능하다.
		// System.out.println("x의 값: " + x);			// 컴파일 오류
		System.out.println("y의 값: " + StaticService.y);
	}
}
