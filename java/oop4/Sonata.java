public class Sonata extends Car {
	
	public Sonata() {
		System.out.println("Sonata 생성자가 실행됨");
	}

	public void currentSpeed() {
		// System.out.println("현재속도 : " + speed);
		// speed에 접근할 수 없음
	
		System.out.println("현재속도 : " + getSpeed());
	}

	void speedUp() {
		int current = getSpeed();
		setSpeed(current + 20);
	}
}
