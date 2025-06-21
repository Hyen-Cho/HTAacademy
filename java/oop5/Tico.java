public class Tico extends AbstractCar {
	// interface의 추상메소드 구현

	public void aircon() {
		System.out.println("티코는 찬바람만 나옴");
	}

	public void radio() {
		System.out.println("티코는 라디오가 나옴");
	}

	public void navi() {
		System.out.println("티코는 길찾기 기능을 지원하지 않음");
	}
}
