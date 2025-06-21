public class SwitchDemo1 {
	public static void main(String[] args) {
		
		String grade = "실버";

		switch (grade) {
			case "골드":
				System.out.println("5%가 적립됩니다.");
				break;
			case "실버":
				System.out.println("3%가 적립됩니다.");
				break;
			case "브론즈":
				System.out.println("1%가 적립됩니다.");
				break;
			default:
				System.out.println("적립되지 않습니다.");
		}
	}
}
