public class PainterApp {
	public static void main(String[] args) {
		
		Painter 그림판 =  new Painter();

		BluePen pen1 = new BluePen();
		RedPen pen2= new RedPen();

		그림판.drawShape(pen1);
		그림판.drawShape(pen2);
	}
}
