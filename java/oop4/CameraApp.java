public class CameraApp {
	public static void main(String[] args) {
		
		WebCamera c = new WebCamera();

		c.picture();	// �θ�κ��� ��ӹ��� ��� ���
		c.save();		// WebCamera�� �����ǵ� ��� ���
		c.delete();		// WebCamera�� �����ǵ� ��� ���
	}
}
