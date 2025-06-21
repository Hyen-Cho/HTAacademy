public class ForDemo5 {
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i);		// 1 2 3 4 5 7 8 9 10
		}
	}
}
