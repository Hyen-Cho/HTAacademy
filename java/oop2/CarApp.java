public class CarApp {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.color);			// 필드에 저장된 값 표현
		System.out.println(car1.getColor());	// 조회 메소드를 실행해서 획득된 값 표현

		Car car2 = new Car();
		System.out.println(car2.color);
		car2.color = "실버";
		car2.setColor("실버");
		System.out.println(car2.color);

		Car car3 = new Car("화이트");
		System.out.println(car3.color);
		
		Car car4 = new Car("미드나잇 블랙");
		System.out.println(car4.color);
		
	}
}
