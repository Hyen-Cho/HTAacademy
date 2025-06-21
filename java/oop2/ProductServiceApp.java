import java.util.Scanner;

public class ProductServiceApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 상품정보 저장/출력/조회 기능을 제공하는 객체를 생성한다.
		// 아래의 각 선택메뉴에서는 ProductService 객체의 기능을 활용한다.
		ProductService service = new ProductService();

		for (;;) {
			System.out.println("1.상품등록 | 2.전체상품 출력 | 3.순서별 상품 출력 | 4.상품번호별 출력 | 0.종료");
			
			System.out.print("메뉴 선택> ");
			int menuNo = scanner.nextInt();

			if (menuNo == 1) {
					
				/*
				 1.상품정보를 입력받는다.
				 2.Product 객체를 생성한다.
				 3.입력받은 상품정보를 Product에 담는다.
				 4.위에서 생성한 ProductService의 addProduct(Product product) 메소드를 실행해서
				   상품정보를 담고 있는 Product가 배열에 저장되게 한다.
				 */
				
				for (int i=0; i<10; i++) {
					System.out.print("상품번호> ");
					int no = scanner.nextInt();

					System.out.print("상품이름> ");
					String name = scanner.next();

					System.out.print("제 조 사> ");
					String manufacturer = scanner.next();

					System.out.print("상품가격> ");
					int price = scanner.nextInt();

					// 상품정보를 담는 Product객체를 생성하고, setter를 활용해서 필드에 정보 저장하기
					Product product = new Product();
					product.setNo(no);
					product.setName(name);
					product.setManufacturer(manufacturer);
					product.setPrice(price);

					// ProductService객체가 제공하는 상품정보를 배열에 저장하는 기능을 실행하기
					service.addProduct(product);

				}					 
			
			} else if (menuNo == 2) {
				System.out.println("[전체 상품정보 출력]");
				service.printAllProducts();
				
			
			} else if (menuNo == 3) {
				System.out.println("[지정된 인덱스의 상품정보 출력]");
				System.out.print("인덱스 입력> ");
				int no = scanner.nextInt();

				service.printProductIndex(no);
			
			} else if (menuNo == 4) {
				System.out.println("[지정된 상품번호 상품정보 출력]");
				System.out.print("상품선택> ");
				int no = scanner.nextInt();
			
				service.printProductByNo(no);

			} else if (menuNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println();
		}
	}
}
