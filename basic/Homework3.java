import java.util.Scanner;

public class Homework3 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int productNumbers = 0;
		String[] productNames = null;
		int[] productAmounts = null;
		int[] productPrices = null;

		for (;;) {
			System.out.println("------------------------------------------------------------");
			System.out.println(" 1.전체 갯수 | 2.구매상품정보 입력 | 3.영수증 출력 | 0.종료");
			System.out.println("------------------------------------------------------------");

			System.out.print("메뉴 선택> ");
			int selecteNo = scanner.nextInt();

			if (selecteNo == 1) {
				System.out.print("총 구매갯수를 입력하시오> ");
				productNumbers = scanner.nextInt();
				productNames = new String[productNumbers];
				productAmounts = new int[productNumbers];
				productPrices = new int[productNumbers];
			
			} else if (selecteNo == 2) {

				for(int i=0; i<productNumbers; i++) {
					System.out.print("["+i+"]번째 상품 이름을 입력하시오> ");
					String name = scanner.next();
					productNames[i] = name;
					System.out.print("["+i+"]번째 상품 수량을 입력하시오> ");
					int amount = scanner.nextInt();
					productAmounts[i] = amount;
					System.out.print("["+i+"]번째 상품 가격을 입력하시오> ");
					int price = scanner.nextInt();
					productPrices[i] = price;
				}

			} else if (selecteNo == 3) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("상품명		구매수량		단가		구매가격");
				System.out.println("---------------------------------------------------------------");

				int totalPrice = 0;
				for (int i=0; i<productNumbers; i++) {
					String name = productNames[i];
					int amount = productAmounts[i];
					int price = productPrices[i];
					int buyPrice = amount * price;
					totalPrice += buyPrice;
				
					System.out.println(name + "\t\t" + amount + "\t\t" + price + "\t\t" + buyPrice);
				}
				
				System.out.println("---------------------------------------------");
				System.out.println("합계					" + totalPrice);
				System.out.println("---------------------------------------------");

			} else if (selecteNo == 0) {
				System.out.println("시스템 종료");
				break;		
			}
		}
		
	}
}