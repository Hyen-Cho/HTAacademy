public class Car {

	String color;
	
	// ������ ����
	Car () {					// �⺻������
		System.out.println("�⺻ �����ڰ� �����.");
		color = "���ϱ׷���";
	}

	Car(String customColor) {			
		System.out.println("�÷��� ���޹޴� �����ڰ� �����.");
		color = customColor;
	}
	
	// �ʵ尪�� �����ϴ� �޼ҵ�
	String getColor() {					// ��ȸ�޼ҵ�
		return color;
	}
	
	// ���޹��� ������ �ʵ尪�� �����ϴ� �޼ҵ�
	void setColor(String c) {			// ����޼ҵ�
		color = c;
	}
}
