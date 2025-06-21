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
			System.out.println(" 1.��ü ���� | 2.���Ż�ǰ���� �Է� | 3.������ ��� | 0.����");
			System.out.println("------------------------------------------------------------");

			System.out.print("�޴� ����> ");
			int selecteNo = scanner.nextInt();

			if (selecteNo == 1) {
				System.out.print("�� ���Ű����� �Է��Ͻÿ�> ");
				productNumbers = scanner.nextInt();
				productNames = new String[productNumbers];
				productAmounts = new int[productNumbers];
				productPrices = new int[productNumbers];
			
			} else if (selecteNo == 2) {

				for(int i=0; i<productNumbers; i++) {
					System.out.print("["+i+"]��° ��ǰ �̸��� �Է��Ͻÿ�> ");
					String name = scanner.next();
					productNames[i] = name;
					System.out.print("["+i+"]��° ��ǰ ������ �Է��Ͻÿ�> ");
					int amount = scanner.nextInt();
					productAmounts[i] = amount;
					System.out.print("["+i+"]��° ��ǰ ������ �Է��Ͻÿ�> ");
					int price = scanner.nextInt();
					productPrices[i] = price;
				}

			} else if (selecteNo == 3) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("��ǰ��		���ż���		�ܰ�		���Ű���");
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
				System.out.println("�հ�					" + totalPrice);
				System.out.println("---------------------------------------------");

			} else if (selecteNo == 0) {
				System.out.println("�ý��� ����");
				break;		
			}
		}
		
	}
}