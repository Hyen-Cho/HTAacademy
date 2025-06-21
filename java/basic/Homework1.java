import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("### 총구매수량 표시 프로그램 ###");

		int price = 0;
		int num = 0;
		int total =0;

		System.out.println("가격을 입력하시오");
		price = scanner.nextInt();
		System.out.println("구매수량을 입력하시오");
		num = scanner.nextInt();

		total = price * num;

		System.out.println("가격 : " + price);
		System.out.println("구매수량 : " + num);
		System.out.println("총구매가격 : " + total);
	}
}