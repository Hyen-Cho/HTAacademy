public class EmployeeApp {
	public static void main(String[] args) {
		// ��ü ���� <--- �⺻������ Ȱ��
		Employee emp1 = new Employee();
		// setter�� Ȱ���ؼ� �ʵ� �ʱ�ȭ
		emp1.setNo(10);
		emp1.setName("ȫ�浿");
		emp1.setDept("����1��");
		emp1.setSalary(3000000);
		emp1.setWorkingYear(4);
		emp1.setTel("010-1111-2222");
		
		// ��ü ���� <--- �Ű������� ���޹޴� �����ڸ� �̿��ؼ� �ʵ� �ʱ�ȭ
		Employee emp2 = new Employee(20, "������", "�λ���", 2500000, 2, "010-3333-4444");

		// Employee��ü 2�� ���� �� �ִ� �迭��ü�� �����ؼ� employees�� ���
		Employee[] employees = new Employee[2];
		// employees�� �����ϴ� �迭�� 0��°�� 1��°�� ������ ������ ��ü�� ���
		employees[0] = emp1;
		employees[1] = emp2;

		// �迭�� ����� ������� �����ȣ�� �̸�, �޿��� ȭ�鿡 ǥ���ϱ�
		for (Employee emp : employees) {
			int ��� = emp.getNo();
			String �̸� = emp.getName();
			int �޿� = emp.getSalary();

			System.out.println("�����ȣ : " + ���);
			System.out.println("����̸� : " + �̸�);
			System.out.println("�Ǽ��ɾ� : " + �޿�);
		
		}
	}
}
