import java.util.Scanner;

public class IfDemo7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 상품가격, 구매수량, 현재 포인트를 입력받는다.
		// 50만원 이상 구매시 구매금액의 5% 할인(총구매가격*5/100)
		// 30만원 이상 구매시 구매금액의 2% 할인(총구매가격*2/100)

		// 현재 포인트가 10000점 이상일 때는 실제지불금액의 0.3%를 포인트로 적립
		// 현재 포인트가 5000점 이상일 때는 실제지불금액의 0.2%를 포인트로 적립
		// 그 외 0.1%를 포인트로 적립

		// 상품가격, 구매수량, 총 구매가격, 할인받은금액, 실제지불금액을 표시
		// 적립전 포인트, 포인트적립량, 적립후 포인트

		
		int price = 0;
		int amount = 0;
		int totalPrice = 0;
		int discountPrice = 0;
		int payPrice = 0;
		
		int currentPoint = 0;
		int point = 0;
		int savedPoint = 0;

		System.out.println("상품가격을 입력하시오.");
		price = scanner.nextInt();
		System.out.println("구매수량을 입력하시오.");
		amount = scanner.nextInt();
		System.out.println("현재 포인트를 입력시오.");
		currentPoint = scanner.nextInt();

		totalPrice = price * amount;			// 총구매금액: 가격 * 수량
		
		if (totalPrice >= 500000) {				// 총구매금액이 50만원 이상일때
			discountPrice = totalPrice*5/100;	// 할인금액: 총금액*5/100
		} else if(totalPrice >= 300000) {		// 총구매금액이 50만원 이상일때
			discountPrice = totalPrice*2/100;	// 할인금액: 총금액*2/100
		}

		payPrice = totalPrice - discountPrice;	// 실제지불금액: 총구매금액 - 할인금액

		if (currentPoint >= 10000) {			// 현재포인트가 10000점 이상일 때
			point = payPrice*3/1000;			// 포인트적립량: 실제지불금액*3/1000
		} else if (currentPoint >= 5000) {		// 현재포인트가 5000점 이상일 때
			point = payPrice*2/1000;			// 포인트적립량: 실제지불금액*2/1000
		} else {								// 그 외에는
			point = payPrice*1/1000;			// 포인트적립량: 실제지불금액*1/1000
		}

		savedPoint = currentPoint + point;		// 적립후포인트: 현재포인트 + 포인트적립량

		System.out.println("상품가격 " + price);
		System.out.println("구매수량 " + amount);
		System.out.println("총구매가격 " + totalPrice);
		System.out.println("할인받은 금액 " + discountPrice);
		System.out.println("실제지불금액 " + payPrice);
		System.out.println("적립전 포인트 " + currentPoint);
		System.out.println("포인트적립량 " + point);
		System.out.println("적립후 포인트 " + savedPoint);
			
	}
}