// 인터페이스는 다른 인터페이스를 하나 이상 상속받을 수 있다.

public interface Safeable extends Camera, AutoDrivable {
	void airbag();
}
