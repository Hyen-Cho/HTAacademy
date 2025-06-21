public class PhotoShop {
	
	private Pen pen;	
	/*
		PhotoShop은 Pen이 필요하다.
		PhotoShop은 Pen에 의존한다.
		필드변수를 사용: 의존성주입(Dependency Injection)

		<필드의 다형성>
		부모 객체를 사용해야 다른 것을 사용할 수 있다.
	*/

	public PhotoShop() {
	
	}

	// Setter 메소드
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	// 도형그리기 기능
	public void drawShape() {
		pen.draw();
	}
}
