public class ForDemo10 {
	public static void main(String[] args) {
		
		// 구구단 가로로 표현하기
		// x,y 시작하는 숫자와 자리를 바꿔준다
		// ln' 을 지워준다. 보기쉽게 \t\t\t(공백)을 넣어준다.

		for (int x=1; x<=9; x++) {
			for (int y=2; y<=9; y++) {
				System.out.print(y + "*" + x + " = " + (x*y) + "\t\t\t");

				// 10이하면 자리수가 줄어드니까 공백을 넣어준다.
				if (x*y < 10) {
					System.out.print(" ");			
				}
			}

			System.out.println();
		}
	}
}
