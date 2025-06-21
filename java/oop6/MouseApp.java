public class MouseApp {
	public static void main(String[] args) {
		Mouse m1 = new Mouse() {
			public void click() {
				System.out.println("공격포인트를 클릭한다.");
			}
			public void dbClick() {
			
			}
			public void wheel() {
			
			}
		};

		Mouse m2 = new MouseAdapter() {
			public void click() {
				System.out.println("공격포인트를 클릭한다.");
			}
		}
	}
}
