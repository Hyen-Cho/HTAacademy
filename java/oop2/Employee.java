// ��� ������ ��� ��ü
public class Employee {
	// �����ȣ, �̸�, �ҼӺμ���, �޿�,		�ٹ�����,		��ȭ��ȣ
	// no		name	dept		salary		workingYear		tel

	// ����� �ʵ� ����
	private int no;
	private String name;
	private String dept;
	private int salary;
	private int workingYear;
	private String tel;

	// �⺻ ������
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

	// getter �޼ҵ�
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

	// setter �޼ҵ�
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
