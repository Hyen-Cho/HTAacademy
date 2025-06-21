public class HRMgrApp {
	public static void main(String[] args) {

		// HRMgr객체 생성
		HRMgr mgr = new HRMgr();

		// DataReader인터페이스를 구현한 NetworkDataReader객체 생성
		NetworkDataReader reader1 = new NetworkDataReader();

		// HRMgr의 reader잭에 위에서 생성한 NetworkDataReader객체 연결
		mgr.setReader(reader1);
		mgr.load();

		DatabaseDataReader reader2 = new DatabaseDataReader();
		mgr.setReader(reader2);
		mgr.load();
	}
}
