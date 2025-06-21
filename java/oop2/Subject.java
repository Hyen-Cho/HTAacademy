public class Subject {
	private int no;				// �����ȣ
	private String name;		// �����
	private String professor;	// ��米����

	public Subject() {
	
	}
	// ������ ����
	public Subject(int no, String name, String professor) {
		this.no = no;
		this.name = name;
		this.professor = professor;
	}

	// �����ȣ(intŸ���� ��)�� �����ϴ� �޼ҵ�
	public int getNo() {
		return no;
	}
	// �� �����ȣ(intŸ���� ��)�� ���޹޾Ƽ� �� ��ü�� �ʵ尪�� �����ϴ� �޼ҵ�
	public void setNo(int no) {
		this.no = no;
	}
	// �����(StringŸ���� ��)�� �����ϴ� �޼ҵ�
	public String getName() {
		return name;
	}
	// �� �����(StringŸ���� ��)�� ���޹޾Ƽ� �� ��ü�� �ʵ尪�� �����ϴ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}

	public String getProfessor() {
		return professor;
	}
	// �� ��米��(StringŸ���� ��)�� ���޹޾Ƽ� �� ��ü�� �ʵ尪�� �����ϴ� �޼ҵ�
	public void setProfessor(String professor) {
		this.professor = professor;
	}

	// �޼ҵ� ����
	public void displayInfo() {
		System.out.println("�����ȣ : " + no);
		System.out.println("�� �� �� : " + name);
		System.out.println("��米�� : " + professor);
	}
}
