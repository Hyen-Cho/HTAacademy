import java.util.Scanner;

public class OpDemo10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("### 수리비 계산 프로그램 ###");

		int year = 0;			// 구매년도를 담을 그릇
		int distance = 0;		// 주행거리를 담을 그릇
		boolean pay = false;	// 유상수리 여부를 담을 그릇

		System.out.println("구매년도를 입력하세요");
		year = scanner.nextInt();
		System.out.println("주행거리를 입력하세요");
		distance = scanner.nextInt();

		// 구매기간이 3년을 넘거나 주행거리가 50000km를 넘는 경우 유상수리로 판단
		pay = (2019 - year) > 3 || distance > 50000;

		System.out.println("유상수리 여부 " + pay);


	}
}
