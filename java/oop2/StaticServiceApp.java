public class StaticServiceApp {
	public static void main(String[] args) {
		
		// 정적필드, 정적메소드는 객체 생성없이 즉시 사용가능하다.
		// 클래스이름.필드명
		// 클래스이름.메소드명()	형태로 사용한다.
		StaticService.y = 10;		// 정적필드 사용하기
		StaticService.m2();			// 정적메소드 사용하기

		// final 변수 z에는 새로운 값을 할당할 수 없다.
		StaticService.z = 20;		// 컴파일 오류
		System.out.println(StaticService.z);
	}
}
