public class CarApp {
	public static void main(String[] args) {
		
		/*
			Sonata 객체를 생성할 때
				부모객체인 Car가 먼저 생성되고 Sonata객체가 생성된다
		*/
		Sonata car1 = new Sonata();
		car1.speedUp();
		car1.currentSpeed();
		
		
		Sonata car2 = new Sonata();
	}
}
