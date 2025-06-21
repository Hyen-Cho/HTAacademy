// Car 인터페이스의 일부기능을 구현하기 위한 추상클래스
// - 모든 Car구현객체가 동일하게 구현하는 내용을 미리 구현해서
//   구현클래스의 구현부담을 줄이는 역할을 수행한다.

public abstract class AbstractCar implements Car {
	
	public void start() {
		System.out.println("자동차를 출발시킨다.");
	}

	public void stop() {
		System.out.println("자동차를 정지시킨다.");
	}
}
// 추상클래스는 추상메소드를 가질 수 있기 때문에 
// interface의 모든 메소드를 구현할 필요가 없다.
