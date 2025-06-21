public class IfDemo3 {
	public static void main(String[] args) {
		
		int score = 91;

		// 60점 이상 합격(합격자중에서 95점 이상 입학금 면제, 그외 입학금 10만원)
		if (score >= 60) {
			System.out.println("합격입니다.");
			if (score >= 95) {
				System.out.println("입학금 면제대상입니다.");
			} else {
				System.out.println("입학금 10만원을 납부하세요.");
			}
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
