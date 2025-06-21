public class MallService {
	private Category[] categories = new Category[10];
	private Product[] products = new Product[100];

	private int catPosition = 0;
	private int proPosition = 0;

	public MallService() {
		categories[catPosition++] = new Category(100, "가구");
		categories[catPosition++] = new Category(200, "가전제품");
		categories[catPosition++] = new Category(300, "주방용품");
	}

	// 새로운 카테고리 등록기능
	/*
		1. 전달받은 Category객체를 categories 배열에 대입한다.
		 * 배열에 대입하기 ---> 배열명[위치] = 값;
		 * 저장되는 배열의 위치는 catPosition으로 지정한다.
		2. 다음에 저장될 Category객체를 위해서 catPosition의 값을 1 증가시킨다.
	*/

	public void addCategory(Category category) {
		if (catPosition < categories.length) {
			categories[catPosition] = category;
			catPosition++;
		}
	}

	public Category getCategory(int categoryNo) {
		/*
			1. 제공할 Category객체를 담을 변수를 미리 만든다.
			2. 배열의 각 요소를 하나씩 추출한다.	<--- enhanced-for문 사용
			3. 추출한 Category객체가 null이 아니고 추출한 객체의 번호와
				전달받은 카테고리번호가 일치하면 추출한 객체를 1번에서 생성한 변수에 담는다.
			4. return문을 이용해서 값을 제공(반환)한다.
		*/
		Category category = null;
		
		for (Category cat : categories) {
			if (cat != null && cat.getNo() == categoryNo) {
				category = cat;
			}
		}

		return category;
	}

	public void addProduct(Product product) {
		if (proPosition < products.length) {
			products[proPosition] = product;
			proPosition++;
		}
	
	}

	public void printAllCategories() {
		for (Category c : categories) {
			if (c != null) {
				System.out.println("카테고리 번호 : " + c.getNo());
				System.out.println("카테고리 이름 : " + c.getName());
			}
		}
	
	}

	public void printAllProducts() {
		for (Product p : products) {
			if (p != null) {
				p.printDetail();
			}
		}
	}

	public void printProductsByCategory(int categoryNo) {
		for (Product p : products) {
			if (p != null) {
			Category c = p.getCat();
			
				if (c.getNo() == categoryNo) {
				p.printDetail();
				}
			}

			/*	다른방법
			if (p != null && p.getCat().getNo() == categoryNo) {
				p.printDetail();
			}
			*/
		}
	}
}