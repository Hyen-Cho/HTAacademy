public class HRMgrApp {
	public static void main(String[] args) {

		// HRMgr��ü ����
		HRMgr mgr = new HRMgr();

		// DataReader�������̽��� ������ NetworkDataReader��ü ����
		NetworkDataReader reader1 = new NetworkDataReader();

		// HRMgr�� reader�迡 ������ ������ NetworkDataReader��ü ����
		mgr.setReader(reader1);
		mgr.load();

		DatabaseDataReader reader2 = new DatabaseDataReader();
		mgr.setReader(reader2);
		mgr.load();
	}
}
