public class Car {

	private String name;
	private int speed;
	
	public Car() {
		//super();		<--- ��������, �ڵ����� �߰���
		System.out.println("Car �����ڰ� �����");
	}

	public Car(String name, int speed) {
		//super();		<--- ��������, �ڵ����� �߰���
		this.name = name;
		this.speed = speed;
		System.out.println("Car(String, int) ������ �����");
	}

	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("����Ѵ�.");
	}
	public void stop() {
		System.out.println("�����");
	}

	public void carInfo() {
		System.out.println("### �������� ###");
		System.out.println("�� �� �� : " + name);
		System.out.println("��    �� : " + speed);
	
	}
}
