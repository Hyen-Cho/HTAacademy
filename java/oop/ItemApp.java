import java.util.Scanner;

public class ItemApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Item[] cart = new Item[3];		// Item 객체를 3개 담을 수 있는 빈방인 cart 배열을 만들겠다.

		for (;;) {
			System.out.println("------------------------------------");
			System.out.println(" 1.입력 | 2.출력 | 0.종료");
			System.out.println("------------------------------------");

			System.out.print("선택> ");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
					
				for (int i=0; i<3; i++) {
					System.out.print("상품명 입력> ");
					String productName = scanner.next();
					System.out.print("수량 입력> ");
					int productAmount = scanner.nextInt();
					System.out.print("상품가격 입력> ");
					int productPrice = scanner.nextInt();

					Item item = new Item();		// 상품정보 저장용 Item 객체 생성
					item.name = productName;
					item.amount = productAmount;
					item.price = productPrice;

					cart[i] = item;				// 배열에 item 객체를 담기

				}

			} else if (selectNo == 2) {
				for (Item x : cart) {
					System.out.println(x.name + "\t" + x.amount + "\t" + x.price);
					
				}
			
			} else if (selectNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
}
