public class TypeDemo2 {
	public static void main(String[] args) {
		// 문자타입 : char

		char c1 = 'A';
		// char c1 = "A";	// 에러!! "A"는 문자열이다.

		// 유니코드 0041번에 해당하는 글자가 c2에 저장된다.
		char c2 = '\u0041';
		// 아스키코드 65번에 해당하는 글자가 c3에 저장된다.
		char c3 = 65;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("123\t123\n\n123");
		System.out.println("정보처리 시험에 \"합격\"하였습니다.");
		}
}

