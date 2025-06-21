import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 국어, 영어, 수학 점수를 입력받아서
		// 평균이 70점 이상이면 합격, 그 외는 불합격으로 표시하는 프로그램

		System.out.println("### 합격,불합격을 표시하는 프로그램 ###");

		int kor = 0;
		int eng = 0;
		int math = 0;
		int avg = 0;

		System.out.println("국어 점수를 입력하시오.");
		kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		math = scanner.nextInt();

		avg = (kor + eng + math)/3;

		if (avg >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		String result = "";
		if (avg >= 70) {
			result = "합격";
		} else {
			result = "불합격";
		}

		System.out.println("합격여부 " + result);
		
	}
}
