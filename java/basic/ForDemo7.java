import java.util.Scanner;

public class ForDemo7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dan = 0;

		System.out.println("출력할 단을 입력하세요");
		dan = scanner.nextInt();
		
		// 구구단 출력
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		
		}
	}
}
