// �� Ŭ������ 1���� �߻�Ŭ������ ��Ӱ���� �������� interface�� �������踦 ���� �� �ִ�.

public class Genesis extends AbstractCar
	implements Highpassable, HeadupDisplayble, Safeable {
	
	
	public void aircon() {
		System.out.println("���׽ý��� ������ �µ��� �ù��� ������");
	}

	public void radio() {
		System.out.println("���׽ý��� �ڵ����� ���� ���ļ� ä���� �˻���");
	}

	public void navi() {
		System.out.println("���׽ý��� ���������� ��θ� �ȳ���");
	}

	public void highpass() {
		System.out.println("���׽ý��� �����н��� ������");
	}

	public void headupDisplay() {
		System.out.println("���׽ô� ���������� ������â�� ǥ���մϴ�.");
	}

	public void record() {
		System.out.println("���׽ý��� ���� ������ ��ȭ�մϴ�.");
	}

	public void autoDrive() {
		System.out.println("���׽ý��� ���� ������ �����մϴ�.");
	}

	public void airbag() {
		System.out.println("���׽ý��� ������� �����մϴ�.");
	}
}
