public class PhotoShopApp {
	public static void main(String[] args) {
		
		PhotoShop ppoShop = new PhotoShop();
		
		// setPen�� ���ؼ� ������� ������
		BluePen pen1 = new BluePen();
		ppoShop.setPen(pen1);

		ppoShop.drawShape();
	}
}
