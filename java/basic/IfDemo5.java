import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 상품가격, 상품수량을 입력받아서 총구매가격을 표시하고
		// 총구매가격이 50만원 이상이면 5만원 상품권
		// 총구매가격이 30만원 이상이면 1만원 상품권
		// 그 외는 1시간 무료주차권을 제공하는 프로그램

		int price = 0;
		int amount = 0;
		int totalPrice = 0;

		System.out.println("상품가격을 입력하시오.");
		price = scanner.nextInt();
		System.out.println("상품수량을 입력하시오.");
		amount = scanner.nextInt();

		totalPrice = price*amount;

		if (totalPrice >= 500000) {
			System.out.println("5만원 상품권");
		} else if (totalPrice >= 300000) {
			System.out.println("1만원 상품권");
		} else {
			System.out.println("1시간 무료주차권");
		}

		Strint gift = "";
		if (totalPrice >= 500000) {
			gift = "5만원 상품권";
		} else if (totalPrice >= 300000) {
			gift = "3만원 상품권";
		} else {
			gift = "무료 주차권";
		}

		System.out.println(gift + "를 지급합니다.");
	}
}
