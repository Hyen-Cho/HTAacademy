public abstract class Printer {

	// 모든 프린터가 가지고 있는 기능(종류에 상관없이 동일한 기능들)
	// 자식클래스의 구현부담을 줄여준다.
	public void on() {
		System.out.println("전원 켜기");
	}
	public void off() {
		System.out.println("전원 끄기");
	}
	public void feed() {
		System.out.println("용지 공급하기");
	}
	
	// 추상메소드 정의
	/*
		모든 프린터들이 가지고 있는 출력기능(프린터마다 구현내용이 다를 것으로 예상)을
		void print()라는 추상메소드로 추상화함으로써
		모든 프린터들이 출력기능은 void print() { 구체적인 구현내용 }로 통일되게 정의하게 만듦
	*/
		public abstract void print();
}
