import java.util.Scanner;

public class ForDemo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int giftCard = 0;
		int totalPrice = 0;
		int price = 0;

		// 여러 개의 상품가격을 입력받아서, 구매금액이 상품권가격을 초과하면
		// 가격입력을 중지하고, 현재 총 구매금액을 출력하기

		// 입력받기
		System.out.println("상품권 가격을 스캔하세요");
		giftCard = scanner.nextInt();

		for (;;) {												// 무한루프

			// 수행문
			if (totalPrice <= giftCard) {			// 총금액이 상품권가격보다 이하면
				System.out.println("상품을 스캔하세요");		// 입력받기
				price = scanner.nextInt();
				totalPrice = totalPrice + price;				// 총금액 누적

			} else {											// 초과하면
				break;											// 중지
			}

		}

		System.out.println("구매금액: " + totalPrice);
	}
}
