public class PenApp {
	public static void main(String[] args) {
	
		/* 익명객체
			- 객체 생성할 수 없는 인터페이스/추상클래스를 가지고
			  객체 생성시점에 추상화된 메소드를 즉석에서 구현해서
			  객체를 생성한 것.
			- 별도의 구현클래스 정의없이 객체 생성이 가능하다.
		*/

		Pen redPen = new Pen() {

			// 추상화된 메소드 재정의
			public void draw() {
				System.out.println("빨갛게 그리기...");
			}
		};
		redPen.draw();

		Pen bluePen = new Pen() {
			public void draw() {
				System.out.println("파랗게 그리기...");
			}
		};
		bluePen.draw();
	}
}
