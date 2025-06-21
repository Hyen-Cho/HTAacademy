import java.util.Scanner;		// 고슬링 아저씨가 만들어 놓은 Scanner 라는 프로그램

public class OpDemo9 {
	public static void main(String[] args) {

		// 키보드 입력을 읽어오는 객체 만들기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("### 합격여부 판단 프로그램 ###");
		
		// 그릇 만드는 중
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = 0;			// 총점을 담는 그릇
		int avg = 0;			// 평균점수를 담는 그릇
		boolean pass = false;	// 합격여부를 담는 그릇

		// 입력 받는 곳
		System.out.println("국어점수를 입력하세요");
		kor = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scanner.nextInt();

		// 계산
		total = kor + math + eng;
		avg = total/3;
		pass = avg >= 60;

		// 출력
		System.out.println("국어점수 : " + kor);
		System.out.println("수학점수 : " + math);
		System.out.println("영어점수 : " + eng);
		System.out.println("종합점수 : " + total);
		System.out.println("평균점수 : " + avg);
		System.out.println("합격여부 : " + pass);
	}
}