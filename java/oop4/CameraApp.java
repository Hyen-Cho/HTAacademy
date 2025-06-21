public class CameraApp {
	public static void main(String[] args) {
		
		WebCamera c = new WebCamera();

		c.picture();	// 부모로부터 상속받은 기능 사용
		c.save();		// WebCamera에 재정의된 기능 사용
		c.delete();		// WebCamera에 재정의된 기능 사용
	}
}
