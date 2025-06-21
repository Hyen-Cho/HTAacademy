public class IfDemo2 {
	public static void main(String[] args) {
		
		int score = 96;

		if (score >= 90) {
			System.out.println("A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("B학점 입니다.");
		} else if (score >= 70) {
			System.out.println("C학점 입니다.");
		} else if (score >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
	}
}
