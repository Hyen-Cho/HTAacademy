import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int productNumbers = 0;				// 구매 갯수 그릇
		String[] productNames = null;		// 배열 길이가 몇개인지 모르는 상품 이름
		int[] productPrices = null;			// 배열 길이가 몇개인지 모르는 상품 가격
		int total = 0;						// 합계
		
		for (;;) {
			System.out.println("------------------------------------------------------------");
			System.out.println(" 1.전체 갯수 | 2.구매상품정보 입력 | 3.영수증 출력 | 0.종료");
			System.out.println("------------------------------------------------------------");

			System.out.print("메뉴선택> ");
			int selectNo = scanner.nextInt();

			/*
				전체 상품갯수를 입력받는다.
				전체 상품갯수만큼 상품이름을 담는 배열과, 상품가격을 담는 배열을 생성한다.
			*/
			if (selectNo == 1) {
				System.out.print("상품종류의 갯수> ");
				productNumbers = scanner.nextInt();				// 구매갯수
				productNames = new String[productNumbers];		// productNames에 productNumbers 갯수만큼 배열길이를 만든다.
				productPrices = new int[productNumbers];		// productPrices에 productNumbers 갯수만큼 배열길이를 만든다.

			/*
				전체 상품갯수만큼 상품이름과 상품가격을 입력받는 작업을 반복한다.
				상품이름과 상품가격을 각각 입력받아서 해당 배열에 순서대로 저장한다.
			*/

			} else if (selectNo == 2) {

				for (int i=0; i<productNumbers; i++) {					// 구매갯수만큼 1씩 증가하는 것을 반복한다.
					System.out.print("["+i+"]번째 상품이름 입력> ");
					String productName = scanner.next();
					productNames[i] = productName;						// 상품이름의 i번째 값은 i번째에 입력한 상품이름이다.

					System.out.print("["+i+"]번째 상품가격 입력> ");
					int price = scanner.nextInt();
					productPrices[i] = price;							// 상품가격의 i번째 값은 i번째에 입력한 가격이다.
					
				}
			
			for (int price : productPrices) {
				total = total + price;
			}

			/*
				전체 상품이름과 상품가격을 화면에 출력한다.(enhanced-for문 사용안됨)
			*/

			} else if (selectNo == 3) {
				System.out.println("구매상품 리스트");
				System.out.println("------------------------------------------");
				System.out.println(productNames[0] + "\t\t" + productPrices[0]);
				System.out.println(productNames[1] + "\t\t" + productPrices[1]);
				System.out.println(productNames[2] + "\t\t" + productPrices[2]);
				System.out.println("------------------------------------------");
				System.out.println("합계" + total);
			
				
			} else if (selectNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}


		}
	}
}