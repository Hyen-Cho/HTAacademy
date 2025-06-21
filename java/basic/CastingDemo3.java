public class CastingDemo3 {
	public static void main (String[] args) {
		int kor = 50;
		int math = 60;
		int eng = 80;

		// 국어점수, 수학점수, 영어점수를 전부 합한 결과를 totalScore에 대입한다.
		int totalScore = kor + math + eng;	// 연산우선순위 '=' 제일 마지막이다
		System.out.println(totalScore);		// 190

		// 현재 totalScore에 저장된 값 --> 190
		// (double)190/3 -> 190.0/3 -> 190.0/3.0 --------> 63.33333....
		// avg 그릇에 대입된 값은 63.333333.... 이다.
		int avg = totalScore/3;					// 63
		double avg2= totalScore/3.0;			// 63.33333.....	(정수/실수)
		double avg3 = (double)totalScore/3;		// 63.33333....		(실수/정수)
		System.out.println(avg);
		System.out.println(avg2);
	}
}
