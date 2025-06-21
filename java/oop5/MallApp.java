import java.util.Scanner;

public class MallApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MallService mall = new MallService();

		for (;;) {
			System.out.println("1.카테고리 등록 | 2.카테고리 출력 | 3.상품등록 | 4.상품출력 | 5.카테고리별 상품출력 | 0.종료");

			System.out.print("메뉴 선택> ");
			int select = scanner.nextInt();

			if (select == 1) {
				// 1. 번호와 이름을 입력받는다.
				// 2. Category객체를 생성한다.
				// 3. Category객체의 setter를 사용해서 값을 저장한다.
				// 4. MallService(위에서 생성한 mall리모콘)의 addCategory메소드에게 Category객체를 전달한다.

				System.out.println("### 카테고리 등록 ###");

				System.out.print("카테고리 번호 입력> ");
				int no = scanner.nextInt();
				System.out.print("카테고리 이름 입력> ");
				String name = scanner.next();

				Category cat = new Category();
				cat.setNo(no);
				cat.setName(name);
				mall.addCategory(cat);
		
			} else if (select == 2) {
				// 1. MallService(위에서 생성한 mall리모콘)의 printAllCategories메소드를
				//		실행해서 모든 카테고리 정보를 출력한다.
				System.out.println("### 카테고리 출력 ###");

				mall.printAllCategories();
			
			} else if (select == 3) {
				/*
					1. 카테고리번호, 상품번호, 상품이름, 가격을 입력받는다.
					2. MallService(위에서 생성한 mall리모콘)의 getCategory메소드에게
						1번에서 입력받은 카테고리번호를 전달해서 번호에 해당하는 Category를 제공받는다.
					3. Product객체를 생성한다.
					4. Product객체의 setter를 사용해서 상품번호, 이름, 가격,
						2번에서 획득한 Category객체를 저장한다.
					5. MallService(위에서 생성한 mall리모콘)의 addProduct메소드에게 Product객체를 전달한다.
				*/
				System.out.println("### 상품등록 ###");

				System.out.print("상품번호 입력> ");
				int no = scanner.nextInt();
				System.out.print("상품이름 입력> ");
				String name = scanner.next();
				System.out.print("상품가격 입력> ");
			
				int price =  scanner.nextInt();
				System.out.print("카테고리번호 입력> ");
				int catNo = scanner.nextInt();


				Category c = mall.getCategory(catNo);

				Product p = new Product();
				p.setNo(no);
				p.setName(name);
				p.setPrice(price);
				p.setCat(c);

				mall.addProduct(p);
				
			
			} else if (select == 4) {
				System.out.println("### 등록한 상품 출력");

				mall.printAllProducts();
			
			} else if (select == 5) {
				System.out.println("### 카테고리별 상품 출력");

				System.out.print("카테고리 번호 입력> ");
				int no = scanner.nextInt();

				mall.printProductsByCategory(no);
			
			} else if (select == 0) {
				System.out.println("프로그램종료");
				break;
			}
		}
	}
}