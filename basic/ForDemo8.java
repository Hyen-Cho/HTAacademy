public class ForDemo8 {
	
	public static void main(String[] args) {

		for (int x=1; x<=2; x++) {
			// System.out.println("�ٱ��� for���� ���๮");
			System.out.println("["+x+"]");
			for (int y=1; y<=3; y++) {
				// System.out.println("���� for���� ���๮");
				System.out.println("{"+x+"}{"+y+"}");			
			}
		}
	}
}
