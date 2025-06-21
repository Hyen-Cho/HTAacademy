public class Car {

	private String name;
	private int speed;
	
	public Car() {
		//super();		<--- 생략가능, 자동으로 추가됨
		System.out.println("Car 생성자가 실행됨");
	}

	public Car(String name, int speed) {
		//super();		<--- 생략가능, 자동으로 추가됨
		this.name = name;
		this.speed = speed;
		System.out.println("Car(String, int) 생성자 실행됨");
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
		System.out.println("출발한다.");
	}
	public void stop() {
		System.out.println("멈춘다");
	}

	public void carInfo() {
		System.out.println("### 차량정보 ###");
		System.out.println("모 델 명 : " + name);
		System.out.println("속    도 : " + speed);
	
	}
}
