public class Category {
	private int no;
	private String name;
	

	// 기본 생성자
	public Category () {
	
	}
	
	// 필드를 초기화하는 생성자
	public Category (int no, String name) {
		this.no = no;
		this.name = name;
	}

	// Getter/Setter 메소드
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