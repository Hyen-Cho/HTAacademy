public class Painter {
	
	/*
		<�Ű������� ������>
		fillColor�޼ҵ�� drawShape�޼ҵ��
		Pen�� ��ӹ޴� ��� Pen���� ���޹��� �� �ִ�.

		�޼ҵ� ������ p.draw()�� �����ϸ� ���޹��� xxxPem��ü�� �����ǵ� draw()�� ����ȴ�.
		* Pen�� ������ ������� draw()�� �����ϸ�
		  ������ ���޹��� ��ü�� �����ǵ� draw()�� ����Ǽ� �渶���� ���� ����� �����ȴ�.
		
		������� �״��, ��ü�� �ٸ� => �ٸ������ ������.
	*/
	public void fillColor(Pen p) {
		p.draw();
	}

	// ��ü�� ������(BluePen, RedPen, YellowPen) ���� �ʿ䰡 ���� Pen �ϳ��� �޾Ƶ� �ȴ�.
	public void drawShape(Pen p) {
		p.draw();
	}
}
