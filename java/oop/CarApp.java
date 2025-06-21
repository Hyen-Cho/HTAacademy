public class CarApp {
	public static void main(String[] args) {
		// Car 설계도로 객체 생성하기
		// new Car();

		// Car 설계도로 객체 생성하고 생성된 객체의 주소값을 참조변수(리모콘)에 대입하기
		Car c1 = new Car();
		Car c2 = new Car();

		// 생성된 객체의 속성(필드)에 값 담기
		c1.modelName = "제네시스";
		c1.maker = "현대자동차";
		c1.price = 70000000;
		c1.makeYear = 2019;

		c2.modelName = "xc40";
		c2.maker = "볼보자동차";
		c2.price = 54000000;
		c2.makeYear = 2018;

		// 생성된 객체의 속성 출력에 사용하기
		System.out.println(c1.modelName);
		System.out.println(c1.maker);

		System.out.println(c2.modelName);
		System.out.println(c2.maker);
	}
}
