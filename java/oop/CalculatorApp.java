public class CalculatorApp {
	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		int r = c.plus(10, 6);
		System.out.println("������� " + r);

		double r1 = c.area(3);
		double r2 = c.area(5);
		System.out.println("���� ���� " + r1);
		System.out.println("���� ���� " + r2);

	}
}