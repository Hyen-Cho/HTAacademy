public class Sonata extends Car {
	
	public Sonata() {
		System.out.println("Sonata �����ڰ� �����");
	}

	public void currentSpeed() {
		// System.out.println("����ӵ� : " + speed);
		// speed�� ������ �� ����
	
		System.out.println("����ӵ� : " + getSpeed());
	}

	void speedUp() {
		int current = getSpeed();
		setSpeed(current + 20);
	}
}
