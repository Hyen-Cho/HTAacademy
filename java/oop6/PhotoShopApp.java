public class PhotoShopApp {
	public static void main(String[] args) {
	
		PhotoShop ppoShop = new PhotoShop();

		Pen redPen = new Pen () {
			public void draw() {
				System.out.println("»¡°²°Ô...");
			}
		};
		ppoShop.drawLine(redPen);

		ppoShop.drawLine(new Pen() {
			public void draw() {
				System.out.println("ÆÄ¶þ°Ô");
			}
		});

		ppoShop.drawLine(() -> System.out.println("³ë¶þ°Ô"));
	}
}

