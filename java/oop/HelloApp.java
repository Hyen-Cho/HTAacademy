public class HelloApp {
	public static void main(String[] args) {
		
		// 1.
		Hello hello = new Hello();		// 객체를 만든다.
		hello.morning();				// 메소드 실행(호출)
		
		// 2.
		hello.greeting("이순신");
		hello.greeting("강감찬");
		
		// 3.
		hello.promise("천성현",5);
		hello.promise("강희경",7);

		// 다른 표현
		String username = "김다윤";
		hello.greeting(username);
	}
}
