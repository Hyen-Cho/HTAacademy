import java.util.Scanner;

public class ForDemo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 숫자 두개를 입력받아서 첫번째 숫자부터 두번째 숫자사이의 합계를 구하는 프로그램
		// 사용자가 시작숫자를 끝숫자보다 더크게 입력했을 경우 오류문구
		
		int begin = 0;
		int end = 0;
		int total = 0;

		System.out.println("시작 숫자를 입력하시오.");
		begin = scanner.nextInt();
		System.out.println("끝 숫자를 입력하시오.");
		end = scanner.nextInt();

		// 더 좋은 표현

		if (begin < end) {
			
			//다른표현
			for (; begin<=end; begin++) {
			total += begins;
			}
			System.out.println(total);
		
		} else {
			System.out.println("값이 올바르지 않습니다.");
			
		}
		
	}
}
