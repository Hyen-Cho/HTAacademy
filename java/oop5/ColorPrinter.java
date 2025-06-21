public class ColorPrinter extends Printer {
	
	// Printer 클래스에 정의된 추상메소드 재정의
	public void print() {
		System.out.println("컬러로 출력합니다.");
	}

	// ColorPrinter의 고유기능
	public void photo() {
		System.out.println("고품질 사진을 출력합니다.");
	}
}