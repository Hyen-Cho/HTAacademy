public class ForDemo10 {
	public static void main(String[] args) {
		
		// ������ ���η� ǥ���ϱ�
		// x,y �����ϴ� ���ڿ� �ڸ��� �ٲ��ش�
		// ln' �� �����ش�. ���⽱�� \t\t\t(����)�� �־��ش�.

		for (int x=1; x<=9; x++) {
			for (int y=2; y<=9; y++) {
				System.out.print(y + "*" + x + " = " + (x*y) + "\t\t\t");

				// 10���ϸ� �ڸ����� �پ��ϱ� ������ �־��ش�.
				if (x*y < 10) {
					System.out.print(" ");			
				}
			}

			System.out.println();
		}
	}
}
