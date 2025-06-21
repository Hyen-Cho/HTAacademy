public class CarApp2 {
	public static void main(String[] args) {
		Genesis car1 = new Genesis();
		car1.setName("G90");
		car1.setSpeed(350);
		car1.setPrice(1000000000);
		car1.carInfo();
		

		Genesis car2 = new Genesis("G90L", 400, 150000000);
		
		car2.carInfo();
	}
}
