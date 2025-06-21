public class Painter {
	
	/*
		<매개변수의 다형성>
		fillColor메소드와 drawShape메소드는
		Pen을 상속받는 모든 Pen들을 전달받을 수 있다.

		메소드 내에서 p.draw()를 실행하면 전달받은 xxxPem객체에 재정의된 draw()가 실행된다.
		* Pen의 종류와 상관없이 draw()를 실행하면
		  실제로 전달받은 객체의 재정의된 draw()가 실행되서 펜마다의 고유 기능이 발현된다.
		
		사용방법은 그대로, 객체가 다름 => 다른결과가 발현됨.
	*/
	public void fillColor(Pen p) {
		p.draw();
	}

	// 객체를 여러개(BluePen, RedPen, YellowPen) 받을 필요가 없이 Pen 하나만 받아도 된다.
	public void drawShape(Pen p) {
		p.draw();
	}
}
