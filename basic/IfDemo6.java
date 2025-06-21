import java.util.Scanner;

public class IfDemo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 상품가격, 구매수량을 입력받아서 총구매가격을 계산하고
		// 50만원 이상 구매시 구매금액의 5% 할인(총구매가격*5/100)
		// 30만원 이상 구매시 구매금액의 2% 할인(총구매가격*2/100)
		// 그 외 할인 없음

		// 상품가격, 구매수량, 총구매가격, 할인받은 금액, 실제지불금액을 표시하기

		// 그릇 만들기
		int price = 0;
		int amount = 0;
		int totalPrice = 0;
		int dcPrice = 0;
		int pay = 0;

		// 입력받기
		System.out.println("상품가격을 입력하시오.");
		price = scanner.nextInt();
		System.out.println("구매수량을 입력하시오.");
		amount = scanner.nextInt();

		// 계산하기
		totalPrice = price * amount;
		
		// 조건 만들기
		if (totalPrice >= 500000) {
			dcPrice = totalPrice*5/100;
		} else if (totalPrice >= 300000) {
			dcPrice = totalPrice*2/100;
		}							// 그 이하는 할인 없으므로 else 없어도 된다.
		
		pay = totalPrice - dcPrice;

		//출력하기
		System.out.println("총구매  금액 " + totalPrice);
		System.out.println("할인받은금액 " + dcPrice);
		System.out.println("실제지불금액 " + pay);
	}
}
