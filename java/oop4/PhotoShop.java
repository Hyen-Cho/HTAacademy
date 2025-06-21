public class PhotoShop {
	
	private Pen pen;	
	/*
		PhotoShop�� Pen�� �ʿ��ϴ�.
		PhotoShop�� Pen�� �����Ѵ�.
		�ʵ庯���� ���: ����������(Dependency Injection)

		<�ʵ��� ������>
		�θ� ��ü�� ����ؾ� �ٸ� ���� ����� �� �ִ�.
	*/

	public PhotoShop() {
	
	}

	// Setter �޼ҵ�
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	// �����׸��� ���
	public void drawShape() {
		pen.draw();
	}
}
