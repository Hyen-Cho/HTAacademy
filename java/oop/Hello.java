public class Hello {
	
	// 1.
	// 메소드 정의
	// 입력/출력(반환값) 없음, 동작 있음

	void morning() {
		System.out.println("좋은 아침입니다.");
		System.out.println("좋은 하루 보내세요.");

		/*
		클래스를 사용해서 객체가 만들어지고
		그 객체 안에 있는 기능과 속성을 사용하는 것.
		사용은 그 객체의 주소값을 담은 리모컨을 사용해서...
		*/

	}
	
	// 2.
	// 메소드 정의
	// 입력값있음/반환값 없음, 동작 있음
	void greeting(String x) {				// 변수를 만들어야 함.
		System.out.println(x + "님 반갑습니다.");
	}

	// 3.
	// 메소드 정의
	// 입력값있음/반환값 없음, 동작 있음
	
	void promise(String name, int hour) {	
		System.out.println(name +"님" + hour + "시에 만납시다.");
	// 매개변수 이름 잘 짓자. 매개변수 갯수는 제한없음.
	
	}
}
