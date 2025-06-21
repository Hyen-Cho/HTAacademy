public class ForDemo8 {
	
	public static void main(String[] args) {

		for (int x=1; x<=2; x++) {
			// System.out.println("바깥쪽 for문의 수행문");
			System.out.println("["+x+"]");
			for (int y=1; y<=3; y++) {
				// System.out.println("안쪽 for문의 수행문");
				System.out.println("{"+x+"}{"+y+"}");			
			}
		}
	}
}
