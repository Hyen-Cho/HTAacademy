public class HRMgr {
	// DataReader�������̽��� ������ ��ü�� ����� ��(�׸�)�� ����
	private DataReader reader;
	
	public void setReader(DataReader reader) {
		this.reader = reader;
	}

	public void load() {
		reader.read();
	}
}
