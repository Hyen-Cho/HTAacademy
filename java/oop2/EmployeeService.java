public class EmployeeService {

	Employee[] database = new Employee[3];

	public EmployeeService() {
		database[0] = new Employee(10, "������", "����1��", 250, 2, "010-1234-5678");
		database[1] = new Employee(20, "������", "�����", 350, 3, "010-1111-1111");
		database[2] = new Employee(30, "�̼���", "�λ���", 300, 2, "010-1234-2222");
	}
	
	// ���ο� ��������� ���޹޾Ƽ� ����ϴ� ���

	// ������ �����ȣ�� ���޹޾Ƽ� �� ��ȣ�� �ش��ϴ� ��������� �����ϴ� ���

	// ��� ��������� ����ϴ� ���
	public void printAllEmployees() {
		for (Employee e : database) {
			int no = e.getNo();
			String name = e.getName();
			String dept = e.getDept();
			int salary = e.getSalary();
			int workingYear = e.getWorkingYear();
			String tel = e.getTel();

			System.out.println("�����ȣ : " + no);
			System.out.println("����̸� : " + name);
			System.out.println("�ҼӺμ� : " + dept);
			System.out.println("�Ǽ��ɾ� : " + salary);
			System.out.println("�ٹ���� : " + workingYear);
			System.out.println("��ȭ��ȣ : " + tel);
			System.out.println();
		}
	}

	// ��ȸ�� �����ȣ�� ���޹޾Ƽ� �� ��ȣ�� �ش��ϴ� ��������� �����ϴ� ���
	public Employee getEmployee(int empNo) {
		Employee emp = null;
		
		for (Employee e : database) {
			if (empNo == e.getNo()) {		// �޼ҵ� �̿��Ҷ� '()' �� �־��ش�.
				emp = e;
				break;
			}
		}
		return emp;
	}
}
