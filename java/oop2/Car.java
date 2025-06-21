public class Car {

	String color;
	
	// 생성자 정의
	Car () {					// 기본생성자
		System.out.println("기본 생성자가 실행됨.");
		color = "녹턴그레이";
	}

	Car(String customColor) {			
		System.out.println("컬러를 전달받는 생성자가 실행됨.");
		color = customColor;
	}
	
	// 필드값을 제공하는 메소드
	String getColor() {					// 조회메소드
		return color;
	}
	
	// 전달받은 값으로 필드값을 변경하는 메소드
	void setColor(String c) {			// 변경메소드
		color = c;
	}
}
