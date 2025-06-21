public class Genesis extends Car {
	private int price;

	public Genesis() {
		//super();		<--- 생략가능, 자동으로 추가됨
		System.out.println("Genesis() 생성자가 실행됨");
	}

	// 부모의 생성자를 필드의 초기화로 활용
	public Genesis(String name, int speed, int price) {
		super(name, speed);			// 부모의 생성자
		this.price = price;
		System.out.println("Genesis(String, int, int) 생성자 실행됨");
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void carInfo() {
		super.carInfo();	// 부모클래스에 정의된 carInfo() 호출
		System.out.println("가    격 : " + price);
	}
}