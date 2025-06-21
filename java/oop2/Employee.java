// 사원 정보를 담는 객체
public class Employee {
	// 사원번호, 이름, 소속부서명, 급여,		근무연수,		전화번호
	// no		name	dept		salary		workingYear		tel

	// 비공개 필드 정의
	private int no;
	private String name;
	private String dept;
	private int salary;
	private int workingYear;
	private String tel;

	// 기본 생성자
	public Employee() {
	}

	public Employee(int no, String name, String dept, int salary, int workingYear, String tel) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.workingYear = workingYear;
		this.tel = tel;
	}

	// getter 메소드
	public int getNo() {
		return no;
	} 

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	public int getWorkingYear() {
		return workingYear;
	}

	public String getTel() {
		return tel;
	}

	// setter 메소드
	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setWorkingYear(int workingYear) {
		this.workingYear = workingYear;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
