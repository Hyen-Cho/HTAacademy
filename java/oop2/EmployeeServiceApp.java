public class EmployeeServiceApp {
	public static void main(String[] args) {
	
		EmployeeService service = new EmployeeService();

		// ��� ������� ����غ���
		service.printAllEmployees();

		// 10�� ��� ã��
		Employee x = service.getEmployee(10);
		System.out.println(x.getNo() + ", " + x.getName());

		Employee y = service.getEmployee(20);
		System.out.println(y.getNo() + ", " + y.getName());
	}
}
