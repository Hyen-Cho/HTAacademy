import java.util.Scanner;

public class Homework2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("### 사은품제공여부 프로그램 ###");

		int grade = 0;
		int price = 0;
		int num = 0;
		int total = 0;
		boolean pass = false;

		System.out.println("등급을 입력하시오");
		grade = scanner.nextInt();
		System.out.println("가격을 입력하시오");
		price = scanner.nextInt();
		System.out.println("구매수량을 입력하시오");
		num = scanner.nextInt();

		total = price * num;
		pass = grade == 1 && total >= 1000000;

		System.out.println("등급 : " + grade);
		System.out.println("가격 : " + price);
		System.out.println("구매수량 : " + num);
		System.out.println("총구매금액 : " + total);
		System.out.println("사은품제공여부 : " + pass);
		

	}
}