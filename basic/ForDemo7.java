import java.util.Scanner;

public class ForDemo7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dan = 0;

		System.out.println("����� ���� �Է��ϼ���");
		dan = scanner.nextInt();
		
		// ������ ���
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		
		}
	}
}
