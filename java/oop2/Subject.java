public class Subject {
	private int no;				// 과목번호
	private String name;		// 과목명
	private String professor;	// 담당교수명

	public Subject() {
	
	}
	// 생성자 정의
	public Subject(int no, String name, String professor) {
		this.no = no;
		this.name = name;
		this.professor = professor;
	}

	// 과목번호(int타입의 값)을 제공하는 메소드
	public int getNo() {
		return no;
	}
	// 새 과목번호(int타입의 값)을 전달받아서 그 객체의 필드값을 변경하는 메소드
	public void setNo(int no) {
		this.no = no;
	}
	// 과목명(String타입의 값)을 제공하는 메소드
	public String getName() {
		return name;
	}
	// 새 과목명(String타입의 값)을 전달받아서 그 객체의 필드값을 변경하는 메소드
	public void setName(String name) {
		this.name = name;
	}

	public String getProfessor() {
		return professor;
	}
	// 새 담당교수(String타입의 값)를 전달받아서 그 객체의 필드값을 변경하는 메소드
	public void setProfessor(String professor) {
		this.professor = professor;
	}

	// 메소드 정의
	public void displayInfo() {
		System.out.println("과목번호 : " + no);
		System.out.println("과 목 명 : " + name);
		System.out.println("담당교수 : " + professor);
	}
}
