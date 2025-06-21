public class PhotoShop {

	// Pen인터페이스를 구현한 객체를 전달받아서 선을 그리는 메소드
	public void drawLine(Pen pen) {
		pen.draw();
		System.out.println("선을 그립니다.");
	}
}
