public class PhotoShopApp {
	public static void main(String[] args) {
		
		PhotoShop ppoShop = new PhotoShop();
		
		// setPen을 통해서 블루펜을 전해줌
		BluePen pen1 = new BluePen();
		ppoShop.setPen(pen1);

		ppoShop.drawShape();
	}
}
