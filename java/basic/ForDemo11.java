import java.util.Scanner;

public class ForDemo11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 임의의 숫자 만들기
		int number = (int) (Math.random()*20 + 1);

		// 숫자를 입력받아서 임의의 숫자와 일치하는지 알아내기
		// 임의의 숫자: number, 입력받은 숫자: a
		
		for (;;) {
		System.out.println("숫자를 입력하시오.");
		int a = scanner.nextInt();

			if (number > a) {
				System.out.println("크다");
			} else if (number < a) {
				System.out.println("작다");
			} 

			if (number == a ) {
				System.out.println("정답");
				break;
			}

			// 사용자로부터 숫자를 입력받는다.
			// 입력받은 숫자가 number에 들어있는 값보다
			// 크다면 "크다"를 출력하고, 작다면 "작다"를 출력한다.
			// 입력받은 숫자가 number와 일치하면 반복문을 탈출한다.
		}

		System.out.println("임의의 숫자 : " + number);
	}
}
