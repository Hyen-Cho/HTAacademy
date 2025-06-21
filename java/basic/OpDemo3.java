public class OpDemo3 {
	public static void main(String[] args) {
		int kor = 65;
		int math = 79;
		int eng = 87;

		System.out.println("국어점수 " + kor);					// 65
		System.out.println("수학점수 " + math);					// 79
		System.out.println("영어점수 " + eng);					// 87
		System.out.println("종합점수 " + kor + math + eng);		// 657987
		System.out.println("종합점수 " + (kor + math + eng));	// 231
	}
}
