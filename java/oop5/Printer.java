public abstract class Printer {

	// ��� �����Ͱ� ������ �ִ� ���(������ ������� ������ ��ɵ�)
	// �ڽ�Ŭ������ �����δ��� �ٿ��ش�.
	public void on() {
		System.out.println("���� �ѱ�");
	}
	public void off() {
		System.out.println("���� ����");
	}
	public void feed() {
		System.out.println("���� �����ϱ�");
	}
	
	// �߻�޼ҵ� ����
	/*
		��� �����͵��� ������ �ִ� ��±��(�����͸��� ���������� �ٸ� ������ ����)��
		void print()��� �߻�޼ҵ�� �߻�ȭ�����ν�
		��� �����͵��� ��±���� void print() { ��ü���� �������� }�� ���ϵǰ� �����ϰ� ����
	*/
		public abstract void print();
}
