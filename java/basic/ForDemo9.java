public class ForDemo9 {
	public static void main(String[] args) {
		
		// Math.random();	0보다 크고 1보다 작은 임의의 실수를 만들어 내는 놈
		// 로또 번호

		for (int i=1; i<=6; i++) {
			double number = (int) (Math.random()*45 + 1);	// 강제변환
			System.out.println(number);

		}
	}
}
