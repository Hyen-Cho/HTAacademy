public class PenApp {
	public static void main(String[] args) {
	
		/* �͸�ü
			- ��ü ������ �� ���� �������̽�/�߻�Ŭ������ ������
			  ��ü ���������� �߻�ȭ�� �޼ҵ带 �Ｎ���� �����ؼ�
			  ��ü�� ������ ��.
			- ������ ����Ŭ���� ���Ǿ��� ��ü ������ �����ϴ�.
		*/

		Pen redPen = new Pen() {

			// �߻�ȭ�� �޼ҵ� ������
			public void draw() {
				System.out.println("������ �׸���...");
			}
		};
		redPen.draw();

		Pen bluePen = new Pen() {
			public void draw() {
				System.out.println("�Ķ��� �׸���...");
			}
		};
		bluePen.draw();
	}
}
