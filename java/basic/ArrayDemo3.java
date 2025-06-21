public class ArrayDemo3 {
	public static void main(String[] args) {
		
		if (args.length == 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);

		} else {
			System.out.println("명령행 인자의 갯수가 올바르지 않습니다.");
		}
	}
}