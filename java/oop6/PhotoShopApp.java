public class PhotoShopApp {
	public static void main(String[] args) {
	
		PhotoShop ppoShop = new PhotoShop();

		Pen redPen = new Pen () {
			public void draw() {
				System.out.println("������...");
			}
		};
		ppoShop.drawLine(redPen);

		ppoShop.drawLine(new Pen() {
			public void draw() {
				System.out.println("�Ķ���");
			}
		});

		ppoShop.drawLine(() -> System.out.println("�����"));
	}
}

