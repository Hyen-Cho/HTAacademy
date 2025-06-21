public class HRMgr {
	// DataReader인터페이스를 구현한 객체가 연결될 잭(그릇)을 선언
	private DataReader reader;
	
	public void setReader(DataReader reader) {
		this.reader = reader;
	}

	public void load() {
		reader.read();
	}
}
