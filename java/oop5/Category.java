public class Category {
	private int no;
	private String name;
	

	// �⺻ ������
	public Category () {
	
	}
	
	// �ʵ带 �ʱ�ȭ�ϴ� ������
	public Category (int no, String name) {
		this.no = no;
		this.name = name;
	}

	// Getter/Setter �޼ҵ�
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}

	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}

}