public class CarApp {
	public static void main(String[] args) {
		// Car ���赵�� ��ü �����ϱ�
		// new Car();

		// Car ���赵�� ��ü �����ϰ� ������ ��ü�� �ּҰ��� ��������(������)�� �����ϱ�
		Car c1 = new Car();
		Car c2 = new Car();

		// ������ ��ü�� �Ӽ�(�ʵ�)�� �� ���
		c1.modelName = "���׽ý�";
		c1.maker = "�����ڵ���";
		c1.price = 70000000;
		c1.makeYear = 2019;

		c2.modelName = "xc40";
		c2.maker = "�����ڵ���";
		c2.price = 54000000;
		c2.makeYear = 2018;

		// ������ ��ü�� �Ӽ� ��¿� ����ϱ�
		System.out.println(c1.modelName);
		System.out.println(c1.maker);

		System.out.println(c2.modelName);
		System.out.println(c2.maker);
	}
}
