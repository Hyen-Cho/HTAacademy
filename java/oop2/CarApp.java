public class CarApp {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.color);			// �ʵ忡 ����� �� ǥ��
		System.out.println(car1.getColor());	// ��ȸ �޼ҵ带 �����ؼ� ȹ��� �� ǥ��

		Car car2 = new Car();
		System.out.println(car2.color);
		car2.color = "�ǹ�";
		car2.setColor("�ǹ�");
		System.out.println(car2.color);

		Car car3 = new Car("ȭ��Ʈ");
		System.out.println(car3.color);
		
		Car car4 = new Car("�̵峪�� ��");
		System.out.println(car4.color);
		
	}
}
