public class CastingDemo3 {
	public static void main (String[] args) {
		int kor = 50;
		int math = 60;
		int eng = 80;

		// ��������, ��������, ���������� ���� ���� ����� totalScore�� �����Ѵ�.
		int totalScore = kor + math + eng;	// ����켱���� '=' ���� �������̴�
		System.out.println(totalScore);		// 190

		// ���� totalScore�� ����� �� --> 190
		// (double)190/3 -> 190.0/3 -> 190.0/3.0 --------> 63.33333....
		// avg �׸��� ���Ե� ���� 63.333333.... �̴�.
		int avg = totalScore/3;					// 63
		double avg2= totalScore/3.0;			// 63.33333.....	(����/�Ǽ�)
		double avg3 = (double)totalScore/3;		// 63.33333....		(�Ǽ�/����)
		System.out.println(avg);
		System.out.println(avg2);
	}
}
