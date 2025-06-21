public class ProductService {
	private Product[] database = new Product[10];	// 상품객체 10개를 담는 배열
	private int position = 0;						// 상품객체를 담는 위치

	// 새로운 상품정보를 배열에 저장하는 기능
	public void addProduct(Product product) {
		if (position < database.length) {
		database[position] = product;
		position++;
		}
	}

	// 모든 상품정보를 화면에 출력하는 기능
	public void printAllProducts() {
		for (Product p : database) {
			printProduct(p);

		}
	}

	// 전달받은 순서에 해당하는 상품정보를 화면에 출력하는 기능
	public void printProductIndex(int index) {

		Product p = database[index];
		printProduct(p);
	}

	// 전달받은 상품번호에 해당하는 상품정보를 출력하는 기능
	public void printProductByNo(int productNo) {
		for (Product p : database) {
			if (p != null && p.getNo() == productNo) {
				printProduct(p);
			}
		}
	}

	public void printProduct(Product p) {
		if (p != null) {
			System.out.println("상품번호 : " + p.getNo());
			System.out.println("상품이름 : " + p.getName());
			System.out.println("제 조 사 : " + p.getManufacturer());
			System.out.println("상품가격 : " + p.getPrice());
			System.out.println();
		}
	}
}
