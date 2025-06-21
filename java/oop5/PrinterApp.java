public class PrinterApp {
	public static void main(String[] args) {
		
		// 추상클래스는 new 키워드를 사용해서 객체생성할 수 없다.
		// Printer p1 = new Printer();		// 에러

		BlackAndWhitePrinter p2 = new BlackAndWhitePrinter();
		p2.on();
		p2.feed();
		p2.print();
		p2.off();

		Printer p3 = new BlackAndWhitePrinter();
		p3.on();
		p3.feed();
		p3.print();
		p3.off();

		ColorPrinter p4 = new ColorPrinter();
		p4.on();
		p4.feed();
		p4.print();
		p4.photo();
		p4.off();

		Printer p5 = new ColorPrinter();
		p5.on();
		p5.feed();
		p5.print();
		// p5.photo();		<--- 컴파일 오류
		p5.pff();

	}
}
