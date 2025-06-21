import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int studentNumbers = 0;			// 학생수
		int[] scores = null;			/* 점수를 저장하는 배열.
										참조변수는 미리 값을 저장할 수 없을 때 null 입력 */
		
		for (;;) {
			System.out.println("--------------------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 0.종료");
			System.out.println("--------------------------------------------------------");

			System.out.print("선택> ");
			int selecteNo = scanner.nextInt();

			if (selecteNo == 1) {
				System.out.print("학생수> ");
				studentNumbers = scanner.nextInt();
				scores = new int[studentNumbers];		
				/* 입력된 학생수 만큼의 크기를 가지는
				배열을 생성해서 scores에 그 주소를 담는다*/

			} else if (selecteNo == 2) {
				for (int i=0; i<studentNumbers; i++) {
					System.out.print("["+i+"]번째 점수입력> ");
					int score = scanner.nextInt();
					scores[i] = score;			
					// score로 입력한 값이 scores의 i번째 값에 채워진다.

				}
			} else if (selecteNo == 3) {
				for (int score : scores ) {	
					// scores 에 들어있는 값을 순서대로 출력한다.

					System.out.print(score + " ");
				}
				
			} else if (selecteNo == 4) {
				int total = 0;
				int highScore = 0;
				for (int score : scores) {
					total = total + score;
					if (score > highScore) {
						highScore = score;
					}
				}
				System.out.println("최고점수: " + highScore);
				System.out.println("총    점: " + total);
				System.out.println("평    균: " + total/studentNumbers);
			
			} else if (selecteNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println("\n\n\n");
	
		}
	}
}