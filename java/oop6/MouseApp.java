public class MouseApp {
	public static void main(String[] args) {
		Mouse m1 = new Mouse() {
			public void click() {
				System.out.println("��������Ʈ�� Ŭ���Ѵ�.");
			}
			public void dbClick() {
			
			}
			public void wheel() {
			
			}
		};

		Mouse m2 = new MouseAdapter() {
			public void click() {
				System.out.println("��������Ʈ�� Ŭ���Ѵ�.");
			}
		}
	}
}
