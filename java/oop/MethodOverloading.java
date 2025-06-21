public class MethodOverloading {

	void m() {
		System.out.println("매개변수 없는 m()이 실행됨");
	}

	void m(int a) {
		System.out.println("m(int a)이 실행됨");
	}

	void m(int a, int b) {
		System.out.println("m(int a, int b)이 실행됨");
	}

	void m(String a) {
		System.out.println("m(String)이 실행됨");
	}
	
}
