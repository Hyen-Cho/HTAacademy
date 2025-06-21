public abstract class DatabaseAccess {
	
	public void connect() {
		System.out.println("�����ͺ��̽��� ����");
	}

	public void command() {
		System.out.println("�����ͺ��̽��� ������ ����");
	}

	public void receive() {
		System.out.println("�����ͺ��̽��κ��� ������ ȹ��");
	}

	public void disconnect() {
		System.out.println("�����ͺ��̽��� ��������");
	}

	public abstract void display();		// �߻�ȭ �޼ҵ� ����

	public void access()  {
		connect();
		command();
		receive();
		display();		// �߻�ȭ �޼ҵ�
		disconnect();
	}
}
