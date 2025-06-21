// 한 클래스에 1개의 추상클래스의 상속관계와 여러개의 interface의 구현관계를 가질 수 있다.

public class Genesis extends AbstractCar
	implements Highpassable, HeadupDisplayble, Safeable {
	
	
	public void aircon() {
		System.out.println("제네시스는 설정된 온도로 냉방을 유지함");
	}

	public void radio() {
		System.out.println("제네시스는 자동으로 라디오 주파수 채널을 검색함");
	}

	public void navi() {
		System.out.println("제네시스는 목적지까지 경로를 안내함");
	}

	public void highpass() {
		System.out.println("제네시스는 하이패스를 지원함");
	}

	public void headupDisplay() {
		System.out.println("제네시는 교통정보를 앞유리창에 표시합니다.");
	}

	public void record() {
		System.out.println("제네시스는 주행 내용을 녹화합니다.");
	}

	public void autoDrive() {
		System.out.println("제네시스는 자율 주행을 지원합니다.");
	}

	public void airbag() {
		System.out.println("제네시스는 에어백을 지원합니다.");
	}
}
